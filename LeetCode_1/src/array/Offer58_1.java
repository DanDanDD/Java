package array;

/**
 * @author: Dennis
 * @date: 2020/9/3 18:14
 */
// 翻转单词顺序
public class Offer58_1 {
//    public String reverseWords(String s) {
//        String[] str = s.trim().split(" ");
//        StringBuffer sb = new StringBuffer();
//
//        for (int i = str.length; i > 0; i--) {
//            // 当出现两个或多个连续空格的情况，跳过多余的空格
//            if (str[i-1].equals("")){
//                continue;
//            }
//            sb.append(str[i-1]);
//            if (i > 1){
//                sb.append(" ");
//            }
//        }
//        return sb.toString().trim();
//    }


    // 字符串逆序
    public void Reverse(char[] c, int start, int end){
        while (start < end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseWords(String s){
        if (s == null || s.trim().equals("")){
            return s;
        }
        s = s.trim();
        char[] c = s.toCharArray();
        // i 遇到空格停止（记录单词尾部位置）    j 记录单词头部位置
        int i = 0, j = 0;
        while (i < s.length()){
            // 向后遍历碰到空格 停止
            while (i < c.length && !Character.isSpaceChar(c[i])){
                i++;
            }
            // 当前单词逆序
            Reverse(c,j,i-1);
            // 继续向后遍历 到下一个单词 （避免连续空格情况）
            while(i < c.length && Character.isSpaceChar(c[i])){
                i++;
            }
            // 记录当前单词头部到 j
            j = i;
        }
        // 最后一个单词逆置（跳出循环时，最后一个单词还没有逆置）
        Reverse(c,j,i-1);
        // 字符串整体逆置
        Reverse(c,0,i-1);
        return new String(c).trim();
    }
}
