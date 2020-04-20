package thread.syn;

/**
 * @author: Dennis
 * @date: 2020/3/27 16:00
 */
// 线程不安全的买票
class BuyTicket implements Runnable {
    private int ticketNum = 10;
    boolean flag = true;

    @Override
    public void run() {
        // 设置标志位 让线程停止
        while (flag) {
            try {
                buy();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // synchronized 同步方法
    private synchronized void buy() {
        if (ticketNum <= 0) {
            flag = false;
            return;
        }
        // 模拟延时


        System.out.println(Thread.currentThread().getName() + "买到第" + ticketNum--);
    }
}

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket, "小明").start();
        new Thread(buyTicket, "黄牛党").start();
        new Thread(buyTicket, "老师").start();

    }
}
