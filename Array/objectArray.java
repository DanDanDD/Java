package Array;

/**
 * @author: Dennis
 * @date: 2019/7/26 15:25
 */
class Person{
    private String name;
    private int age;
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    public void Print(){
        System.out.println("name:"+this.name+"  age:"+this.age);
    }
}

public class objectArray{
    public static void main(String[] args) {
        Person[] per = new Person[]{
                new Person("zhangsna",20),
                new Person("lisi",21),
                new Person("wangwu",22)
        };

       for (int i = 0 ;i<per.length;i++){
           per[i].Print();
       }


    }
}
