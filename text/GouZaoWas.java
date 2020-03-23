package text;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @author: Dennis
 * @date: 2020/2/28 17:49
 */

class Dog{
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }     //构造方法

    public void eat(String food){
        System.out.println(this.name + "吃" + food);
    }
}
public class GouZaoWas {
    //构造方法必须与类同名，且没有返回值
//    public GouZaoWas(){
//
//    }
//    public GouZaoWas(String name){
//
//    }


    public static void main(String[] args) {
        Dog dog = new Dog("dd",2);
        dog.eat("gutou");
    }
}
