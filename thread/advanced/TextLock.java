package thread.advanced;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Dennis
 * @date: 2020/3/30 16:27
 */

public class TextLock {
    public static void main(String[] args) {
        TextLock2 textLock2 = new TextLock2();

        new Thread(textLock2).start();
        new Thread(textLock2).start();
        new Thread(textLock2).start();
    }

}

class TextLock2 implements Runnable{
    int ticketNums = 10;

    // 定义 lock 锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();   // 加锁
            try{
                if (ticketNums > 0 ){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticketNums--);
                }else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}