package thread;

/**
 * @author: Dennis
 * @date: 2020/3/25 18:18
 */

// 1、定义一个函数式接口
interface ILike{
    void lambda();
}

// 2、实现类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("i like lambda1");
    }
}


public class Lambda {

    public static void main(String[] args) {
        // 接口 new 了一个实现类
        ILike like = new Like();
        like.lambda();


        // 3.局部内部类
        class Like3 implements ILike{
            @Override
            public void lambda() {
                System.out.println("i like lambda2");
            }
        }
        like = new Like3();
        like.lambda();

        // 4、匿名内部类，没有类的名称，必须借助接口、父类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        };
        like.lambda();

        // 5、 用 Lambda 简化
        like = () ->{
            System.out.println("i like lambda4");
        };
        like.lambda();
    }
}


