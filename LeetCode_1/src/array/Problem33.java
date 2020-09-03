package array;

/**
 * @author: Dennis
 * @date: 2020/7/29 13:26
 */

// 字符串翻转问题
//https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?
public class Problem33 {
//    // str.trim() 去掉字符串前导和尾随的空格
//    public String ReverseSentence(String str) {
//        if (str == null || str.trim().equals("")){
//            return str;
//        }
//
//        String[] string = str.split(" ");
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = string.length ; i > 0; i--) {
//            stringBuffer.append(string[i-1]);
//            if (i > 1){
//                stringBuffer.append(" ");
//            }
//        }
//        return stringBuffer.toString();
//    }

    public void Reverse(char[] c, int start, int end){
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }
    public String ReverseSentence(String str){
        if (str == null || str.length() == 0){
            return str;
        }
        char[] c = str.toCharArray();
        int i = 0, j = 0;
        while (i < c.length){
            while (i < c.length && !Character.isSpaceChar(c[i])){
                i++;
            }
            Reverse(c,j,i-1);
            while (i < c.length && Character.isSpaceChar(c[i])){
                i++;
            }
            j = i;
        }
        Reverse(c,j,i-1);
        Reverse(c,0,i-1);
        return new String(c);
    }

}
