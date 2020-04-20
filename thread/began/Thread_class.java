package thread.began;

/**
 * @author: Dennis
 * @date: 2020/3/24 18:04
 */
// 继承 Thread 类，覆写 run（）方法，创建线程对象，调用 start（）开启线程
public class Thread_class extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程" + i);
        }
    }

    public static void main(String[] args) {
        new Thread_class().start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在睡觉————" + i);
        }

    }
}
