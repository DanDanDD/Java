package com.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * @author: Dennis
 * @date: 2020/7/9 11:54
 */

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        test1();  // 11267
        test2();  // 7913   forkjoin
//        test3(); // 229    stream 并行流
    }

    // 普通程序员
    public static void test1(){
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (Long i = 1L; i <= 10_0000_0000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("sum="+ sum + " 时间："+ (end-start));
    }

    // 会使用ForkJoin
    public static void test2() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinDemo(0L, 10_0000_0000L);
        ForkJoinTask<Long> submit = forkJoinPool.submit(task); // 提交任务
        Long sum = submit.get();

        long end = System.currentTimeMillis();

        System.out.println("sum=" + sum + "时间："+ (end-start));
    }

    // Stream 并行流
    public static void test3(){
        long start = System.currentTimeMillis();

        long sum = LongStream.rangeClosed(0L, 10_0000_0000L).parallel().reduce(0, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println("sum=" + sum + "时间："+ (end-start));
    }
}
