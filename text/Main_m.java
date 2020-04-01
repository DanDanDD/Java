package text;

import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2020/3/29 19:31
 */

public class Main_m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        int n = scanner.nextInt();
        String string = scanner1.nextLine();
        String [] ai = string.split(" ");
        int [] arr = new int[n];


        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(ai[i]);
        }

        if (arr.length == 1){
            System.out.println("0");
            return;
        }

        for (int j = 0; j < n - 1; j++){
            for (int k = 0; k < n - 1; k++){
                int temp = 0;
                if (arr[k] < arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }



    if (arr[1] > n){
                System.out.println("0");
                return;
             }
        int k = 0;
        while (arr[1] < n-1){
            arr[1]++;
            k++;
        }
        System.out.println(k);

    }
}
