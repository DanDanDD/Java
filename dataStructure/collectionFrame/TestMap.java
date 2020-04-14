package collectionFrame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map: key = value
 * HashMap :
 *  1.key 和 value 可以为 null
 *  2.key 不能重复，value 可以重复，key=null（只能有一个，多的会覆盖）
 *
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
        map.put(3,"JavaScript");
        map.put(null,"Perl");
        map.put(5,null);
        map.put(null,"golong");
        map.put(7,"C++");
        System.out.println("Map 的数据：" + map);
        System.out.println("Map 的数据量：" + map.size());
        System.out.println("获取 key=1的值：" + map.get(1));
        System.out.println("获取 key=6的值：" + map.get(6));
        System.out.println("获取所有的 key：" + map.keySet());
        System.out.println("获取所有的 value：" + map.values());
        System.out.println("判断key=7是否存在"+ map.containsKey(7));

        System.out.println("删除key=7的元素："+ map.remove(7));

        System.out.println("Map 的遍历：");
        // 1.key -> value
        // 2.values(无法获取到key)
        // 3.entryset [key-value,,,]

        // 1.key -> value
        for (Integer key : map.keySet()){
            System.out.printf("%d=%s \n",key,map.get(key));
        }
        System.out.println("----------------");

        // 3.entryset [key-value,,,]
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%d=%s \n",key,value);
        }
        System.out.println("----------------");

        //利用迭代器 遍历
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String value = map.get(key);
            System.out.printf("%d=%s \n",key,value);
        }

    }
}
