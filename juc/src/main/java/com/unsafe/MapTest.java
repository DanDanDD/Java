package com.unsafe;

import java.util.*;
        import java.util.concurrent.ConcurrentHashMap;


// java.util.ConcurrentModificationException
public class MapTest {
    public static void main(String[] args) {
        // 默认等价于什么？ new HashMap<>(16,0.75);
        // Map<String, String> map = new HashMap<>();
        //Map<String,String> map = Collections.synchronizedMap(new HashMap<>());
        Map<String,String> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }

    }
}
