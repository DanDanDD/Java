package thread.began;

/**
 * @author: Dennis
 * @date: 2020/3/25 15:26
 */

/*
多线程操作同一个对象

问题：多线程操作同一个资源时，线程不安全，数据紊乱
 */
public class Thread_ticket implements Runnable {
    private int ticketNum = 1;

    @Override
    public void run() {
        while (true) {
            if (ticketNum >= 10) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--拿到第" + ticketNum++ + "票");
        }
    }

    public static void main(String[] args) {
        Thread_ticket thread_ticket = new Thread_ticket();

        new Thread(thread_ticket, "小明").start();
        new Thread(thread_ticket, "老师").start();
        new Thread(thread_ticket, "黄牛").start();

    }
}
