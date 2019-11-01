package ClassandObject2;

/**
 * @author: Dennis
 * @date: 2019/9/5 16:32
 */
class Person{
    {
        System.out.println("Person Object code block");
    }

    public Person(){
        System.out.println("Person Object code ways");
    }
}

public class codeBlock {
    public static void main(String args[]){
        new Person();
        new Person();
    }

}
