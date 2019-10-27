package ClassandObject;

/**
 * @author: Dennis
 * @date: 2019/9/3 23:14
 */

class Object{
    public void print(){
        System.out.println("ways:"+this);
    }
}

public class this_Object {
    public static void main(String args[]){
        Object o1 = new Object();
        System.out.println("main ways:"+o1);
        o1.print();
        System.out.println("**************");
        Object o2 = new Object();
        System.out.println("main ways:"+o2);
        o2.print();
    }
}
