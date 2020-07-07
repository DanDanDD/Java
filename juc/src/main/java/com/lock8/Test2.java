package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author: Dennis
 * @date: 2020/6/19 16:04
 */
/*
8锁 就是关于锁的8个问题
3、两个线程先打印  发短信还是 hello？   （hello）
4、两个对象，两个同步方法   发短信还是打电话  (打电话)
 */
public class Test2 {
    public static void main(String[] args) {
        // 两个对象  两个调用者  有两把锁
        Phone2 phone1 = new Phone2();
        Phone2 phone2 = new Phone2();


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

class Phone2{

    // synchronized 锁的对象是方法的调用者

    public synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }

    // 这里锁没有锁！不是同步方法，不受的影响
    public void hello(){
        System.out.println("hello");
    }
}
