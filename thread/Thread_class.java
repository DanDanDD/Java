package thread;

/**
 * @author: Dennis
 * @date: 2020/3/24 18:04
 */

public class Thread_class extends Thread{
    @Override
    public void run() {
        // run 方法线程体
        for (int i = 0; i < 100; i++) {
            System.out.println("我在学习Java——————"+i);
        }
    }

    public static void main(String[] args) {
        // main 线程  主线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在吃饭——————"+i);
        }
        Thread_class thread = new Thread_class();
        thread.start();
    }
}
