package com.add;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author: Dennis
 * @date: 2020/6/20 18:06
 */

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        /*
        集齐7颗龙珠召唤神龙
         */
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("召唤神龙成功");
        });


        for (int i = 1; i <= 7; i++) {
            final int temp = i;
            // lambda 能操作到 i 吗
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+ "收集"+temp+"龙珠");

                try {
                    cyclicBarrier.await();  //等待

                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
