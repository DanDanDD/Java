package Array;

import java.util.Arrays;

/**
 * @author: Dennis
 * @date: 2019/7/26 11:43
 */

public class araayCopy {
//    public static void printArray(int[] temp){
//        for (int i = 0 ; i<temp.length ; i++){
//            System.out.println(temp[i]);
//        }
//    }
//    public static void main(String[] args){
//        int [] dataA = new int[]{1,2,3,4,5,6,7,8,9,10};
//        int [] dataB = new int[]{11,22,33,44,55,66,77,88,99,100};
//        System.arraycopy(dataB,2,dataA,3,5);
//        printArray(dataA);
//    }
public static void main(String[] args) {
    int[] original = new int[]{1,3,5,6,9};
    int[] result = Arrays.copyOf(original,10);
    for (int i = 0;i<result.length;i++){
        System.out.print(" "+ result[i]);
    }

}
}
