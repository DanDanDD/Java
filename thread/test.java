package thread;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2020/5/25 14:30
 */

public class test {
    private static boolean condition;

    private static class Robot implements Runnable {
        @Override
        public void run() {
            while (condition){
                System.out.println("写作业");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        condition = true;

        Thread t = new Thread(new Robot());
        t.start();

        scanner.nextLine();
        condition = false;
        System.out.println("通知子线程停止");
        t.join();
        System.out.println("子线程停止");
    }


//
//    private static void printFields(){
//        Thread t = Thread.currentThread();
//        System.out.println(t.getId());
//        System.out.println(t.getName());
//        System.out.println(t.getState());
//        System.out.println(t.getPriority());
//        System.out.println(t.isDaemon());
//        System.out.println(t.isAlive());
//        System.out.println(t.isInterrupted());
//    }
//
//    public static void main(String[] args) {
//        Thread thread = new Thread(()->{
//            printFields();
//            try {
//                Thread.sleep(1000000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, "cat");
//        thread.start();
//
//
//        Thread.currentThread().setName("我是主线程pp");
//        printFields();
//        System.out.println("=================================");
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
