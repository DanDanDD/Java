package inherit;

/**
 * @author: Dennis
 * @date: 2019/11/16 17:24
 */

//同一个包下可以发生继承

class Dog extends Animal{
    public Dog (String name){
        super(name);
    }
}
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal("jalsdj");
        System.out.println(animal.name);
        Dog dog = new Dog("asdf");
        System.out.println(dog.name);

    }
}
