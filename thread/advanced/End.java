package thread.advanced;

/**
 * @author: Dennis
 * @date: 2020/3/30 23:02
 */

public class End {
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1");
    }
}