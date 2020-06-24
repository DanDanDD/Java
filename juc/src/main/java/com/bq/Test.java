package com.bq;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        test1();
    }
    /**
     * 抛出异常
     */
    public static void test1(){
        // 队列的大小
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(arrayBlockingQueue.add("a"));
        System.out.println(arrayBlockingQueue.add("b"));
        System.out.println(arrayBlockingQueue.add("c"));

        //IllegalStateException: Queue full  抛出队列已满的异常
        //System.out.println(arrayBlockingQueue.add("d"));

        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());

        //java.util.NoSuchElementException  抛出异常
        //System.out.println(arrayBlockingQueue.remove());
    }
}
