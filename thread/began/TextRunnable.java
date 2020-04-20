package thread.began;

/**
 * @author: Dennis
 * @date: 2020/3/24 18:15
 */

// 实现 Runnable 接口，重写 run() 方法，创建 Runnable 接口实现类对象，创建线程对象传入接口实现类对象，调用 start 方法
public class TextRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在睡觉————" + i);
        }
    }

    public static void main(String[] args) {
        TextRunnable textRunnable = new TextRunnable();
        new Thread(textRunnable).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程" + i);
        }
    }
}
