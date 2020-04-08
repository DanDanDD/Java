package collectionFrame;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/4/7 18:18
 */

public class TestIterator {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Java");
        data.add("C++");
        data.add("Python");
        data.add("PHP");

//        // 遍历1
//        for (int i = 0; i < data.size(); i++){
//            String value = data.get(i);
//            //data.add(value);    // 使用 get()时，不能修改集合
//            //data.remove(i);
//            System.out.println(value);

//        // 遍历2  使用foreach时不能修改线程不安全的集合
//        // 出现ConcurrentModificationException
//        for (String value : data){
//            data.remove("C++");
//            System.out.println(value);
//        }

        // 迭代器
        Iterator<String> iterator = data.iterator();
        // hasNext()     next()
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
            // 根据条件删除元素
            //iterator.remove();
            if (value.startsWith("Java")){
                iterator.remove();
            }
        }
        System.out.println("删除之后的输出");
        System.out.println(data);
    }
}
