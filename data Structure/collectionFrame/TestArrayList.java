package collectionFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/4/3 23:04
 */

public class TestArrayList {

    public static void main(String[] args) {

        // 面向接口编程
        // ArrayList
        //  1.无参 初始化容量是多少
        //  2.有参 int   初始化容量由用户自定义
        //  3.有参  Collection
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1,4);
        List<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(7);
        list.addAll(list1);
        // list.toString()
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.toArray());
        for (Integer e : list){
            System.out.println(e);
        }
        list.remove(2);
        System.out.println(list);

    }
}
