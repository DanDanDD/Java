package array;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author: Dennis
 * @date: 2020/7/27 9:41
 */

public class Probleam22 {
    public static void Swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static boolean isExist(ArrayList<String> result, char[] str){
        return result.contains(String.valueOf(str));
    }

    public static void PermutationHelper(char[] str, int start, ArrayList<String> result){

        if (start == str.length-1){
            // 去重
            if (!isExist(result,str)){
                result.add(new String(str));
            }
            return;
        }
        for (int i = 0; i < str.length; i++){
            Swap(str,start,i);
            PermutationHelper(str, start+1,result);
            Swap(str,start,i);
        }
    }


    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str != null && str.length() > 0){
            PermutationHelper(str.toCharArray(),0,result);
            Collections.sort(result);
        }
        return result;
    }

    public static void main(String[] args) {
        for (String string : Permutation("abc")){
            System.out.println(string);
        }
    }
}
