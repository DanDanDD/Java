package ClassandObject;

/**
 * @author: Dennis
 * @date: 2019/9/2 16:22
 */
class Student{
    private String name;
    private int age;

    public Student (){
        System.out.println("**************");
    }

    public Student(String name){
        this();
        this.name = name;
    }

    public Student(String name,int age){
        this(name);
        this.age = age;
    }
    public String getStuentInfo(){
        return "name:"+name +"  age:"+age;
    }

}

public class this_diaoyong {
    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student("zhangsan");
        Student stu3 = new Student("lisi",20);
        System.out.println(stu1.getStuentInfo());
        System.out.println(stu2.getStuentInfo());
        System.out.println(stu3.getStuentInfo());

    }
}
