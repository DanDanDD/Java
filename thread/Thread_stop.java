package thread;

import java.sql.SQLOutput;

/**
 * @author: Dennis
 * @date: 2020/3/26 14:52
 */
    // 建议线程正常停止   利用次数 不建议死循环
    // 建议使用标志位停止
    // 不要使用 stop 或者 destory 等过时方法
public class Thread_stop implements Runnable {
    private boolean flag = true;
    @Override
    public void run() {
        int i = 1;
        while (flag){
            System.out.println("run-------Thread"+ i++);
        }
    }
    // 设置标志位
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        Thread_stop thread_stop = new Thread_stop();
        new Thread(thread_stop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if (i == 900){
                thread_stop.stop();
                System.out.println("线程停止");
            }
        }
    }
}
