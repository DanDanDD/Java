import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2020/4/7 18:28
 */

public class Scanner_Array {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);

            String str = sc.nextLine();//用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格
            String str1 = sc.nextLine();

            String [] arr = str.split(" ");//拆分字符串成字符串数组
            String [] arr1 = str1.split(" ");
            int [] a = new int[arr.length];
            int [] b = new int[arr1.length];

            for(int j = 0; j < a.length; j++) {
                a[j] = Integer.parseInt(arr[j]);
                b[j] = Integer.parseInt(arr1[j]);
                System.out.print(a[j] + " ");
                System.out.print(b[j] + " ");
            }
        }
}

