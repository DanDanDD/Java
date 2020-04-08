package collectionFrame;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set：集合元素不能重复
 * HashSet：不能排序
 * TreeSet：可以排序
 * 1.元素类型实现Comparable接口
 * 2.TreeSet构造方法提供Comparator的对象
 *
 * @author: Dennis
 * @date: 2020/4/6 16:54
 */
// Set 集合元素不能重复
public class TestSet {

    public static void main(String[] args) {
       // Set<Person> personSet = new HashSet<>();
        Set<Person> personSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //return Integer.compare(o1.getAge(),o2.getAge());
                return o1.getName().compareTo(o2.getName());
            }
        });
        personSet.add(new Person("Jack",22));
        personSet.add(new Person("Tom",18));
        personSet.add(new Person("Mark",9));

        System.out.println("集合元素个数:" + personSet.size());
        System.out.println("集合是否包含Person:" + personSet.contains
                (new Person("Jack",22)));
        System.out.println(personSet);

        // HashSet 中 Collections.sort();

    }

}

