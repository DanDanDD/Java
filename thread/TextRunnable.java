package thread;

import javax.imageio.stream.ImageInputStream;

/**
 * @author: Dennis
 * @date: 2020/3/24 18:15
 */

// 实现 Runnable 接口，重写 run() 方法，执行线程需要丢入 Runnable 接口实现类，调用 start 方法
public class TextRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学 Java————" + i);
        }
    }

    public static void main(String[] args) {
        TextRunnable textRunnable = new TextRunnable();
        Thread thread = new Thread(textRunnable);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在吃饭——————" + i);
        }
    }
}
