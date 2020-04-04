package D2;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
    public static void main(String[] args) {
        Exchanger<String>exchanger = new Exchanger<>();
        //女生线程
        Thread girl = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String str =exchanger.exchange("我暗恋你很久了...");
                    System.out.println("女生说："+str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        girl.start();
        //男生线程
        Thread boy = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("女生缓缓走来...");
                try {
                    Thread.sleep(1000);
                    String str = exchanger.exchange("我喜欢你很久了");
                    System.out.println("男生说："+str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        boy.start();
    }
}
