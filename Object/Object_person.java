package ClassandObject;

import java.io.PrintStream;

/**
 * @author: Dennis
 * @date: 2019/7/27 15:25
 */
class Person{
    private String name;
    private int age;

    public Person(String n,int i){
        setName(n);
        setAge(i);
    }

    public void setName(String n){
        if (n == "zhangsan"){
            name = n;
        }else {
            name = "sb";
        }
    }
    public void setAge(int i){
        if (i>0 && i<200){
            age = i;
        }else {
            age = 0;
        }
    }
    public void getPersonInfo() {
        System.out.println("name:"+name+"   age:"+age);
    }
}

public class Object_person {
    public static void main(String[] args) {
        Person per = new Person("zhangsan",-200);
        new Person("wangwu",20).getPersonInfo();
        per.getPersonInfo();
    }
}
