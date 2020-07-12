package com.single;

/**
 * @author: Dennis
 * @date: 2020/7/12 12:58
 */
// 静态内部类
public class Holder {
    private Holder(){

    }

    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }


    public static class InnerClass{
        private static final Holder HOLDER = new Holder();

    }
}
