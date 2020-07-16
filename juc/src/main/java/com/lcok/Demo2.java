package com.lcok;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Dennis
 * @date: 2020/7/15 17:35
 */

public class Demo2 {
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

class Phone2{
    Lock lock = new ReentrantLock();
    public  void sms(){
        lock.lock(); // 细节问题：lock.lock(); lock.unlock();
        // lock 锁必须配对，否则就会死在里面

        try {
            System.out.println(Thread.currentThread().getName()+"sms");
            call(); // 这里也有锁
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public  void call(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"call");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}