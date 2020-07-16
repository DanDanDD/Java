package com.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Dennis
 * @date: 2020/7/13 21:04
 */

public class CASDemo {

    //CAS  compareAndSet : 比较并交换
    public static void main(String[] args) {
//        AtomicInteger atomicInteger = new AtomicInteger(2020);
        // 注意泛型是一个保证类，引用中注意范围问题
        // 正常在业务操作中，这里面比较的都是一个个对象
        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(1, 1);

        new Thread(()->{
            int stamp = atomicStampedReference.getStamp(); // 获得版本号
            System.out.println("a1--"+stamp);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            atomicStampedReference.compareAndSet(1, 2,
                    atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
            System.out.println("a2--"+atomicStampedReference.getStamp());

            System.out.println(atomicStampedReference.compareAndSet(2, 1,
                    atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1));
            System.out.println("a3--"+atomicStampedReference.getStamp());

        },"a").start();

        // 与乐观锁的原理相同
        new Thread(()->{
            int stamp = atomicStampedReference.getStamp(); // 获得版本号
            System.out.println("b1--"+stamp);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(atomicStampedReference.compareAndSet(1, 99,
                    stamp, stamp + 1));

            System.out.println("b2--" + atomicStampedReference.getStamp());
        },"a").start();
    }
}
