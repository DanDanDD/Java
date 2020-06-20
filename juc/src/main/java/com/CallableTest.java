package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: Dennis
 * @date: 2020/6/20 11:56
 */

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // new Thread(new Runnable()).start();
        // new Thread(new FutureTask<V>()).start();
        // new Thread(new FutureTask<V>(Callable)).start();
        new Thread().start();  //怎么启动Callable

        MyThread thread = new MyThread();
        FutureTask futureTask = new FutureTask(thread);
        // 适配类
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"B").start(); //结果会被缓存，提高效率

        System.out.println(futureTask.get()); // get方法可能会产生阻塞
        // 使用异步通信来处理
    }
}

class MyThread implements Callable<Integer> {
    @Override
    public Integer call(){
        System.out.println("call()");
        return 1024;
    }
}