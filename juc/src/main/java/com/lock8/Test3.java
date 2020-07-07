package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author: Dennis
 * @date: 2020/6/19 16:44
 */
// 5、增加两个静态的同步方法，只有一个对象，先打印谁?（发短信）
// 6、 两个对象，增加两个静态的同步方法，先打印谁？（发短信）
public class Test3 {
    public static void main(String[] args) {
        // 两个对象的 class类模板只有一个，static 锁的是class
        Phone3 phone1 = new Phone3();
        Phone3 phone2 = new Phone3();


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

class Phone3{

    // synchronized 锁的对象是方法的调用者
    // 静态方法 锁的是整个类

    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }

    public static synchronized void call(){
        System.out.println("打电话");
    }

}
