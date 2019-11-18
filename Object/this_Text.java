package ClassandObject;

/**
 * @author: Dennis
 * @date: 2019/8/6 12:20
 */

class Person1{
    private static String country;
    private String name;
    private int age;

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void setCountry(String c){
        country = c;
    }

    public void getPerson1Info(){
        System.out.println("name:"+this.name+"  age:"+this.age
        +"  country:"+country);
    }
}

public class this_Text {
    public static void main(String[] args) {
        Person1.setCountry("China");
        Person1 person1 = new Person1("zhengsan",20);
        person1.getPerson1Info();
    }

}

