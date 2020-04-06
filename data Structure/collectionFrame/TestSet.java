package collectionFrame;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: Dennis
 * @date: 2020/4/6 16:54
 */
// Set 集合元素不能重复
public class TestSet {

    public static void main(String[] args) {
       // Set<Person> personSet = new HashSet<>();
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person("Jack",22));
        personSet.add(new Person("Tom",18));
        personSet.add(new Person("Mark",9));

        System.out.println("集合元素个数:" + personSet.size());
        System.out.println("集合是否包含Person:" + personSet.contains
                (new Person("Jack",22)));
        System.out.println(personSet);

    }

}

