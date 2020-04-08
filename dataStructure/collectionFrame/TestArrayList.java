package collectionFrame;

import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/4/3 23:04
 */

public class TestArrayList {

    public static void code1(){

    }


    public static void main(String[] args) {

        // 面向接口编程
        // ArrayList
        //  1.无参 初始化容量是多少
        //  2.有参 int   初始化容量由用户自定义
        //  3.有参  Collection
//        List<Person> personList = new ArrayList<>();
//        Person p1 = new Person();
//        p1.setName("Jack");
//        p1.setAge(18);
//
//        Person p2 = new Person();
//        p1.setName("Tom");
//        p1.setAge(66);
//
////        personList.add(p1);
////        personList.add(p2);
//
//        personList.add(new Person("Jack",18));
//        personList.add(new Person("Tom",66));
//
//        System.out.println("遍历Person List:");
//        for (Person p : personList){
//            System.out.println(p); // toSting();
//        }
//        System.out.println("判断对象是否存在：");
//        System.out.println(personList.contains(p1));
//
//        Person p3 = new Person();
//        p3.setName("Jack");
//        p3.setAge(18);
//
//        System.out.println(personList.contains(p3));

        // 面向接口编程
        // ArrayList
        //  1.无参 初始化容量是多少
        //  2.有参 int   初始化容量由用户自定义
        //  3.有参  Collection

        List<String> list = new LinkedList<>();
        list.add("A");  // add 默认是尾插
        ((LinkedList<String>) list).addFirst("B");
        ((LinkedList<String>) list).addLast("C");
        System.out.println(list);


    }
}
