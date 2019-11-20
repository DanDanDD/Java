package ClassandObject2;

/**
 * @author: Dennis
 * @date: 2019/9/5 16:32
 */

public class codeBlock {
    public static class HelloA{
        //构造方法
        public HelloA(){
            System.out.println("Hello A 父类构造方法");
        }
        //非静态代码块
        {
            System.out.println("Hello A 父类非静态代码块");
        }
        //静态代码块
        static {
            System.out.println("Hello A 父类静态代码块" );
        }
    }

    public static class HelloB extends HelloA{
        //构造方法
        public HelloB(){
            System.out.println("Hello B 构造方法");
        }
        //非静态代码块
        {
            System.out.println("Hello B 非静态代码块");
        }
        //静态代码块
        static{
            System.out.println("Hello B 静态代码块");
        }
    }

    public static void main(String[] args){
        System.out.println("`````````````````````````");
        new HelloB();
        new HelloB();
        System.out.println("`````````````````````````");
    }

}
