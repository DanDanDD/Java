package com.function;

import java.util.function.Supplier;

// supplier 供给型接口 没有参数，只有返回值
public class Demo4 {
    public static void main(String[] args) {
//        Supplier<Integer> supplier = new Supplier<Integer>() {
////            @Override
////            public Integer get() {
////                System.out.println("get()");
////                return 1024;
////            }
////        };
        Supplier<Integer> supplier = ()->{return 1024;}; // 没有参数
        System.out.println(supplier.get());
    }
}
