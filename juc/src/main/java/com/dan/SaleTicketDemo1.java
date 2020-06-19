package com.dan;

/**
 * @author: Dennis
 * @date: 2020/6/19 10:37
 */
//买票的例子
    // 线程就是一个单独的资源类，没有任何附属的操作
public class SaleTicketDemo1 {
    public static void main(String[] args) {
        // 并发：多线程操作同一个资源类
        Ticket ticket = new Ticket();

        // @FunctionalInterface 函数式接口，
        // jdk1.8 Lambda表达式 (参数)->{代码}
        new Thread(()-> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        },"A").start();

        new Thread(()-> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        },"B").start();

        new Thread(()-> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        },"C").start();
    }
}
// 资源类 OOP
class Ticket{
    // 属性、方法
    private int number = 30;

    // 买票的方式
    public synchronized void sale(){
        if (number > 0){
            System.out.println(Thread.currentThread().getName() + "卖出了第" + (number--) + "票，剩余" + number);
        }
    }
}
