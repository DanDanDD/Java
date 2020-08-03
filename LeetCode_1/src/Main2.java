import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2020/7/31 14:26
 */

public class Main2 {

    public static int reletive_7 (int[] digit) {
        int count = 0;
        for (int value : digit) {
            if (value % 7 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void swap(int[] array,int s, int i){
        int temp = array[s];
        array[s] = array[i];
        array[i] = temp;
    }

    public static void permute(int[] array,int start){
        if (start == array.length){
            System.out.println();
        }
        for (int i = start; i < array.length; i++){
            swap(array,start,i);
            permute(array,start+1);
            swap(array,start,i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] str = s.split(",");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        permute(array,0);
        reletive_7(array);


    }

}
