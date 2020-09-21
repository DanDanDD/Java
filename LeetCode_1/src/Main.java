import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        if (arr.length == 0 || arr == null){
            System.out.println(0);
        }
        int min = arr.length;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1] == arr[i]){
                continue;
            }else {
                min++;
            }
            if (arr[i-1] == arr[i+1]){
                min--;
            }
            if (arr[arr.length-1] != arr[arr.length-2]){
                min++;
            }
        }
        System.out.println(min);
    }
}