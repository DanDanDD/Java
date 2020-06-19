package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author: Dennis
 * @date: 2020/6/19 16:55
 */
// 7、1个静态的同步方法，1个普通的同步方法，一个对象，先打印谁？（打电话）
// 8、1个静态的同步方法，1个普通的同步方法，两个对象，先打印谁？（打电话）


public class Test4 {
    public static void main(String[] args) {
        // 两个对象的 class类模板只有一个，static 锁的是class
        Phone4 phone1 = new Phone4();
        Phone4 phone2 = new Phone4();


        new Thread(()->{
            phone1.sendSms();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        },"B").start();
    }
}

class Phone4{

    //静态的同步方法  锁的是 class类模板
    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    //普通的同步方法   锁的调用者
    public synchronized void call(){
        System.out.println("打电话");
    }
}
