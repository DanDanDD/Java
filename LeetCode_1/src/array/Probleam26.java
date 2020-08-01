package array;

import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2020/7/31 23:00
 */

public class Probleam26 {

    public static boolean IsPalindrome(StringBuffer stringBuffer,int[] start,int[] end){
        int i = 0;
        int j = stringBuffer.length() - 1;
        boolean result = true;
        while (i < j){
            if (stringBuffer.charAt(i) == stringBuffer.charAt(j)){
                i++;
                j--;
            }else {
                result = false;
                break;
            }
        }
        if (start != null){
            start[0] = i;
        }
        if (end != null){
            end[0] = j;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(num > 0){
            StringBuffer stringBuffer = new StringBuffer(scanner.next());
            int[] start = new int[1];
            int[] end = new int[1];
            if (IsPalindrome(stringBuffer,start,end)){
                System.out.println(-1);
            }else {
                stringBuffer.deleteCharAt(end[0]);
                if (IsPalindrome(stringBuffer,null,null)){
                    System.out.println(end[0]);
                }else {
                    System.out.println(start[0]);
                }
            }
            num--;
        }
    }
}
