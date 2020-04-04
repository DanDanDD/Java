package D2;

class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "名字：" +this.name + "，年龄:" +this.age;
    }
}

class Student{}

public class textObject{
    public static void main(String[] args) {
        fun(new Person("zhangsan","25"));
        fun(new Student());
    }

    public static void fun(Object obj){
        System.out.println(obj.toString()   );
    }

}
