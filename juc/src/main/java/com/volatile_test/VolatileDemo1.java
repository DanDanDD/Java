package com.volatile_test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Dennis
 * @date: 2020/7/9 19:01
 */

// 不保证原子性 volatile
public class VolatileDemo1 {
    // 不保证原子性 volatile
    private volatile static AtomicInteger num = new AtomicInteger();

    public static void add(){
//        num ++; // 不是原子性操作
        num.getAndIncrement(); // AtomicInteger 的  +1  方法 CAS
    }

    public static void main(String[] args) {

        // 理论上 num 为20000
        for (int i = 1; i <= 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    add();
                }
            }).start();
        }
        // 只要有除了 gc 和 main 线程之外的线程，主线程就礼让出CPU不向下执行
        while (Thread.activeCount()>2){  // 判断存活线程 （默认存在2个 gc main）
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + " " + num);
    }
}
