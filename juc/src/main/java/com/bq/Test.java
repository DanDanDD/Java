package com.bq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        test3();
    }
    /**
     * 抛出异常
     */
    public static void test1(){
        // 队列的大小
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(arrayBlockingQueue.add("a"));
        System.out.println(arrayBlockingQueue.add("b"));
        System.out.println(arrayBlockingQueue.add("c"));
        System.out.println(arrayBlockingQueue.element());  // 检测队首元素


        //IllegalStateException: Queue full  抛出队列已满的异常
        //System.out.println(arrayBlockingQueue.add("d"));

        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());

        //java.util.NoSuchElementException  抛出异常
        //System.out.println(arrayBlockingQueue.remove());
    }

    // 有返回值，不抛出异常
    public static void test2(){
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(arrayBlockingQueue.offer("a"));
        System.out.println(arrayBlockingQueue.offer("b"));
        System.out.println(arrayBlockingQueue.offer("c"));
        // 不会抛出异常  输出 false
        System.out.println(arrayBlockingQueue.offer("d"));

        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.peek());  // 检测队首元素
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());
        // 不会抛出异常  输出 null
        System.out.println(arrayBlockingQueue.poll());
    }

    // 等待，阻塞（一直阻塞）
    public static void test3() throws InterruptedException {

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(3);

        // 一直阻塞
        arrayBlockingQueue.put("a");
        arrayBlockingQueue.put("b");
        arrayBlockingQueue.put("c");
        //arrayBlockingQueue.put("d"); // 队列没有位置，一直阻塞

        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take()); //没有元素一直阻塞



    }

    // 等待，阻塞（等待超时）
    public static void test4() throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(3);

        arrayBlockingQueue.offer("a");
        arrayBlockingQueue.offer("b");
        arrayBlockingQueue.offer("c");
        arrayBlockingQueue.offer("d",2, TimeUnit.SECONDS);//等待超过2秒退出

        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());
        arrayBlockingQueue.poll(2,TimeUnit.SECONDS); //等待超过2秒退出
    }
}

