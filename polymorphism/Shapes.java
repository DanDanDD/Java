package polymorphism;

/**
 * @author: Dennis
 * @date: 2019/11/28 19:13
 */
class Shape{
//    protected String name;
//    public Shape(String name){
//        this.name = name;
//    }
    public void draw(){
        System.out.println(" ");
    }
}

class cycle extends Shape{

//    public cycle(String name) {
//        super(name);
//    }

    public void draw(){
        System.out.println("○");
    }
}
class rect extends Shape{
    @Override
    public void draw(){
        System.out.println("□");
    }
}
class flower extends Shape{
    @Override
    public void draw(){
        System.out.println("♣");
    }
}
public class Shapes {
    public static void main(String[] args){
        Shape shape1 = new flower();
        Shape shape2 = new rect();
        Shape shape3 = new cycle();
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}
