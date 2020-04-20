package thread.began;

/**
 * @author: Dennis
 * @date: 2020/3/26 17:23
 */
class MyPriority implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
    }
}

public class TestPriority {
    public static void main(String[] args) {
        // 获取主线程的优先级
        System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();
        Thread thread1 = new Thread(myPriority);
        Thread thread2 = new Thread(myPriority);
        Thread thread3 = new Thread(myPriority);
        Thread thread4 = new Thread(myPriority);
        Thread thread5 = new Thread(myPriority);

        // 设置线程优先级
        thread1.start();

        thread2.setPriority(4);
        thread2.start();

        thread3.setPriority(Thread.MAX_PRIORITY);
        thread3.start();

        thread4.setPriority(8);
        thread4.start();

        thread5.setPriority(Thread.MIN_PRIORITY);
        thread5.start();


    }
}
