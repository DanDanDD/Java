package text;

import java.lang.reflect.Array;

/**
 * @author: Dennis
 * @date: 2020/3/22 23:12
 */
// T 被称作类型参数，可以只带任何类型(不包括基本类型)
class Myclass<T>{

}

public class fanXing<T> {
public T[] creat(Class<T> t){
    return (T[])Array.newInstance(t,10);
}

    public static void main(String[] args) {
        fanXing<String> f = new fanXing<>();
        String[] string = f.creat(String.class);
    }
}
