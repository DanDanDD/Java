package text;

import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2020/3/27 19:52
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int T = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
            int n = scanner1.nextInt();

            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            String [] arr1 = str1.split(" ");
            String [] arr2 = str2.split(" ");


            int[] mlength = new int[n];
            int[] mweight = new int[n];
            int sum = 0;
            int p = 0;
            for (int i = 0; i < mlength.length; i++) {
                mlength[i] = Integer.parseInt(arr1[i]);
                mweight[i] = Integer.parseInt(arr2[i]);

                if (mlength[i] + mweight[i] > sum) {
                    p++;
                }
                sum = mlength[i] + mweight[i];
            }
            System.out.println(p);

    }
}
