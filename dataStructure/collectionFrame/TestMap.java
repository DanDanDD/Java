package collectionFrame;

import java.util.HashMap;
import java.util.Map;

/**
 * Map: key = valu
 * @author: Dennis
 * @date: 2020/4/8 23:39
 */

public class TestMap {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"C++");
        map.put(3,"C");
        map.put(4,"PHP");
        System.out.println("Map 的数据：" + map);
        System.out.println("Map 的数据量：" + map.size());
        System.out.println("获取 key=1的值：" + map.get(1));
        System.out.println("获取 key=6的值：" + map.get(6));
        System.out.println("获取所有的 key：" + map.keySet());
        System.out.println("获取所有的 value：" + map.values());

    }
}
