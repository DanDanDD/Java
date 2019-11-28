package inherit;

/**
 * @author: Dennis
 * @date: 2019/11/13 18:53
 */
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(String food){
        System.out.println("动物吃");
        System.out.println(this.name + "吃" + food);
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}


class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

//    public Bird(String name){
//        super(name);
//    }
    @Override
    public void eat(String food){
        // super.eat("niaoshi");   继承方法时  用super.();
        System.out.println("鸟吃");
        System.out.println(this.name + "吃" + food);
    }
    public void fly(){
        System.out.println(this.name + "飞");
    }
}

public class text {
    public static void main(String[] args) {
//        Cat cat = new Cat("咪咪");
//        cat.eat("猫粮");
//        Bird bird = new Bird("啄木鸟");
//        bird.eat("虫子");
//        bird.fly();

        Animal animal = new Animal("动物jj");
        Animal animal2 = new Animal("动物kk");
        Animal animal1 = new Bird("lalalalalalala");  //向上转型
        //animal2.fly();    找不到fly方法

        Animal animal3 = new Bird("小niao");
        if (animal3 instanceof Bird) {
            Bird bird = (Bird)animal3;
            bird.fly();
        }
//        animal2.eat("kkkkkkkkkkk");
//        animal1.eat("shibaba");
//        Cat cat = new Cat("mimi");
//        cat.eat("maoliang");

    }
}
