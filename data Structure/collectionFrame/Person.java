package collectionFrame;

import java.util.Objects;

/**
 * @author: Dennis
 * @date: 2020/4/6 15:18
 */

public class Person implements Comparable<Person> {

    private  String name;

    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Person person = (Person) o;
        return name.equals(person.name) &&
                age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Person o) {
        // this compareTo o
        // this > o return >0
        // this == 0 return 0
        // this <o return <0return 0;

        // 按照年龄排序
        //return this.age - o.age;
        return Integer.compare(this.age,o.age);
        // 按照名字排序
        //return this.getName().compareTo(o.name);
    }
}
