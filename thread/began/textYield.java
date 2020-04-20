package thread.began;

/**
 * @author: Dennis
 * @date: 2020/3/26 15:40
 */
class MyYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        Thread.yield();   // 礼让
        System.out.println(Thread.currentThread().getName() + "线程开始停止 ");

    }
}

public class textYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield, "A").start();
        new Thread(myYield, "B").start();

    }
}
