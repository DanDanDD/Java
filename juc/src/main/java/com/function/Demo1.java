package com.function;

import java.util.function.Function;

/*
Function 函数型接口
只要是函数式接口，就可以用 lambda 表达式简化
 */
public class Demo1 {
    public static void main(String[] args) {
        // 工具类：输出输入的值
//        Function function = new Function<String,String>() {
//            @Override
//            public String apply(String str) {
//                return null;
//            }
//        };
        Function<String,String> function = (str)->{return str;};
        System.out.println(function.apply("asdf"));
    }
}
