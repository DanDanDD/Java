package com.single;

/**
 * @author: Dennis
 * @date: 2020/7/12 12:02
 */
// 懒汉式单例
public class LazyMan {

    private LazyMan(){
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private volatile static LazyMan lazyMan;

    // 双重检测锁的 懒汉式单例 DCL懒汉式
    public static LazyMan getInstance(){
        if (lazyMan == null){
            synchronized (LazyMan.class){
                if (lazyMan == null){
                    lazyMan = new LazyMan(); // 不是一个原子性操作
                    /**
                     * 1、分配内存空间
                     * 2、执行构造方法，初始化对象
                     * 3、把这个对象指向这个空间
                     * 1-2-3
                     * 1-3-2  此时lazyMan 还没完成构造
                     */
                }
            }
        }
        return lazyMan;
    }

    // 多线程并发
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan.getInstance();
            }).start();

        }
    }

}
