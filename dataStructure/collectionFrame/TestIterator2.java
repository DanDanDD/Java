package collectionFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: Dennis
 * @date: 2020/4/8 0:22
 */

public class TestIterator2 {

    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        data.add("Java");
        data.add("C++");
        data.add("Python");
        data.add("PHP");

        // 双向迭代器
        ListIterator<String> listIterator = data.listIterator();

        // 从前往后输出
        System.out.println("从前往后输出:");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + ", ");
        }

        System.out.println("从后往前输出:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous() + ", ");

        }

    }
}
