package Array;

/**
 * @author: Dennis
 * @date: 2019/7/17 10:12
 */

public class statementArray {
//    public static void main(String[] args) {
//        int[] x = new int[5];
//        System.out.println(x.length);
//        x[0] = 1;
//        x[1] = 2;
//        x[2] = 3;
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//        }
//        int[] y = null;
//        y = new int[1];
//        System.out.println(y.length);
//    }
//
//    public static void main(String[] args) {
//        int[] x = null;
//        x = new int[3];
//        System.out.println(x.length);
//        x[0] = 10;
//        x[1] = 20;
//        x[2] = 30;
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//        }
//
//    }

    public static void main(String[] args) {
        int x[] = null;
        int temp[] = null;
        x = new int[3];
        x[0] = 1;
        System.out.println(x[0]);
        temp = x;
        temp[0] = 20;
        System.out.println(x[0]);
    }
}