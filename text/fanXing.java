package text;

/**
 * @author: Dennis
 * @date: 2020/3/22 23:12
 */
// T 被称作类型参数，可以只带任何类型(不包括基本类型)
class Myclass<T>{
    private T x;

    public T getX() {
        return x;
    }
    public  void setX(T x){
        this.x = x;
    }
}

class myclass{
    public <T> T text(T t){

    }
}
public class fanXing {
    public static void main(String[] args) {
        Myclass<String> D = new Myclass<>();
        D.setX("泛型使用");
        String x = D.getX();
        System.out.println(x);
    }

}
