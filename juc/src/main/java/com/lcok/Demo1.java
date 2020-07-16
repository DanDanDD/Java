package com.lcok;

/**
 * @author: Dennis
 * @date: 2020/7/15 17:28
 */
// Synchronized
public class Demo1 {
    public static void main(String[] args) {
        Phone phone = new Phone();

        new Thread(()->{
            phone.sms();
        },"A").start();

        new Thread(()->{
            phone.sms();
        },"B").start();


    }
}


class Phone{
    public synchronized void sms(){
        System.out.println(Thread.currentThread().getName()+"sms");
        call(); // 这里也有锁
    }

    public synchronized void call(){
        System.out.println(Thread.currentThread().getName()+"call");

    }
}