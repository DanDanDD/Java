package Array;

/**
 * @author: Dennis
 * @date: 2019/7/15 16:18
 */


public class digui {
    public static int sum(int x){
        if (x==1){
            return 1;
        }else{
           return x*sum(x-1) ;
        }
    }


    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
