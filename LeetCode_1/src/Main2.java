import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Dennis
 * @date: 2020/7/31 14:26
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] s = string.split(" ");
        int [] arr = new int[s.length];
        for (int i = 0; i < s.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        int x1 = arr[0];
        int x2 = arr[1];
        int x3 = arr[2];
        int x4 = arr[3];
        int y1 = arr[4];
        int y2 = arr[5];
        int y3 = arr[6];
        int y4 = arr[7];

        if ((x3 - x1) > (y3-y1)){
            System.out.println(1);
        }




    }
}
