package array;

/**
 * @author: Dennis
 * @date: 2020/7/29 10:32
 */

public class Probleam32 {

    public void LeftRotateStringHelper(char[] list){
        char temp = list[0];
        int i = 0;
        for ( ; i < list.length - 1; i++){
            list[i] = list[i+1];
        }
        list[i] = temp;
    }

    public String LeftRotateString(String str,int n) {
        if (str.length() == 0 || n == 0){
            return str;
        }
        n %= str.length();
        char[] list = str.toCharArray();

        while (n > 0){
            n--;
            LeftRotateStringHelper(list);
        }
        return new String(list);
    }
}
