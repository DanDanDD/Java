package com.dan;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class SaleTicketDemo2 {
    public static void main(String[] args) {
        // 并发：多线程操作同一个资源类
        Ticket2 ticket = new Ticket2();

        // @FunctionalInterface 函数式接口，
        // jdk1.8 Lambda表达式 (参数)->{代码}
        new Thread(()-> {for (int i = 0; i < 40; i++) {ticket.sale(); }},"A").start();
        new Thread(()-> {for (int i = 0; i < 40; i++) {ticket.sale(); }},"B").start();
        new Thread(()-> {for (int i = 0; i < 40; i++) {ticket.sale(); }},"C").start();
    }
}

// Lock 三部曲
// 1、new ReentrantLock();
// 2、lock.lock();
// 3、finally{ lock.unlock(); }
class Ticket2{
    // 属性、方法
    private int number = 40;

    Lock lock = new ReentrantLock();
    // 买票的方式
    public  void sale(){
        lock.lock(); // 加锁
        try {
            // 业务代码
            if (number > 0){
                System.out.println(Thread.currentThread().getName() + "卖出了第" + (number--) + "票，剩余" + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 解锁
        }
    }
}
