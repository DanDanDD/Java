package com.forkjoin;

import java.util.concurrent.RecursiveTask;

/*
求和计算
ForkJoin      Stream并行流
如何使用 forkjoin
1、forkjoinpool  通过它来执行
2、计算任务 forkjoinPool.execute(ForkJoinTask task)
3、 计算类要继承 ForkJoinTask
 */

public class ForkJoinDemo extends RecursiveTask<Long> {
    private Long start;  // 1
    private Long end;    // 199090000

    // 临界值
    private Long temp = 10000L;

    public ForkJoinDemo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    // 计算方法
    @Override
    protected Long compute() {
        if ((end - start) < temp){
            // 分支合并计算
            Long sum = 0L;
            for (Long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }else { // forkjoin 递归
            Long middle = (start + end) / 2; // 中间值
            ForkJoinDemo forkJoinDemo1 = new ForkJoinDemo(start, middle);
            forkJoinDemo1.fork(); // 拆分任务，把任务压入线程队列
            ForkJoinDemo forkJoinDemo2 = new ForkJoinDemo(middle, end);
            forkJoinDemo2.fork(); // 拆分任务，把任务压入线程队列

            return forkJoinDemo1.join() + forkJoinDemo2.join();
        }
    }
}
