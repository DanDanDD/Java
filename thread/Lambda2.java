package thread;

/**
 * @author: Dennis
 * @date: 2020/3/26 9:30
 */
interface Love {
    void love(int a, int b, int c);
}

public class Lambda2 {
    public static void main(String[] args) {
        Love love = null;
/*        Love love = (int a) ->{
            System.out.println("i love you--"+a);
        };
        //简化 -- 去掉参数类型
        love = (a) -> {
            System.out.println("i love you--"+a);
        };
        //简化 -- 去掉括号

        love = a -> {
            System.out.println("i love you--"+a);
        };

 */
        //简化 -- 去掉花括号
        //love = (a) -> System.out.println("i love you--"+a);

        love = (a, b, c) -> {
            System.out.println("i love you--" + a);
            System.out.println("i love you--" + b);
            System.out.println("i love you--" + c);
        };

        love.love(520, 521, 522);
    }
/*
总结： lambda 表达式只能有一行代码的时候才可简化成一行，如果有多行用代码块包裹
       前提是接口为函数式接口
       多个参数也可以去掉参数类型，但要加上花括号
 */
}
