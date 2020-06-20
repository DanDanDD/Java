package com.dan;

/**
 * @author: Dennis
 * @date: 2020/6/19 10:17
 */

public class demo1 {
    public static void main(String[] args) {
        //获取CPU的核数
        //CPU密集型，IO密集型
        System.out.println(Runtime.getRuntime().availableProcessors());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
