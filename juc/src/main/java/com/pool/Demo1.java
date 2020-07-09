package com.pool;

import java.util.concurrent.*;

public class Demo1 {
    public static void main(String[] args) {
        // Executors 工具类、3大方法
//        ExecutorService threadPool = Executors.newSingleThreadExecutor(); // 单个线程
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);// 创建一个固定的的线程池的大小
//        ExecutorService threadPool = Executors.newCachedThreadPool(); // 可伸缩的

        // 自定义线程池，工作中 ThreadPoolExecutor
         /*
         new ThreadPoolExecutor.AbortPolicy());  // 银行满了，还有人进来，不处理这个人，抛出异常
         new ThreadPoolExecutor.CallerRunsPolicy()); // 哪里来的去哪里
         new ThreadPoolExecutor.DiscardPolicy()); // 队列满了，丢掉任务，不会抛出异常
         new ThreadPoolExecutor.DiscardOldestPolicy()); // 队列满了，尝试去和最早的竞争，也不会抛出异常
          */

         // 最大线程到底如何定义
        // 1、CPU 密集型，（几核就定义为几，可以保证CPU效率最高）
        // 2、IO 密集型  （判断你的程序中十分消耗 io 的线程）
        //        程序    15个大型任务 io十分占用资源

        // 获取 CPU核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy()); // 队列满了，尝试去和最早的竞争，也不会抛出异常
                try {
                    // 最大承载：Deque + mix
                    for (int i = 1; i <= 9; i++) {
                        // 使用了线程池之后，使用线程池来创建线程
                        threadPool.execute(() -> {
                            System.out.println(Thread.currentThread().getName() + " ok");
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    //线程池用完，程序结束，关闭线程池
                    threadPool.shutdown();
                }
        }
    }
