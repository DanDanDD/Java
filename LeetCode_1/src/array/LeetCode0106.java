package array;

/**
 * @author: Dennis
 * @date: 2020/8/23 0:22
 */
/*
字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
比如，字符串aabcccccaaa会变为a2b1c5a3。
若“压缩”后的字符串没有变短，则返回原先的字符串。
你可以假设字符串中只包含大小写英文字母（a至z）
 */
public class LeetCode0106 {
    public String compressString(String S) {
        if (S.length() <= 2 || S == null){
            return S;
        }
        char[] c = S.toCharArray();
        int count = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i+1]){
                count ++;
            }else{
                result.append(c[i]).append(count);
                count = 1;
            }
        }
        result.append(c[c.length - 1]).append(count);
        if (result.length() >= S.length()){
            return S;
        }
        return result.toString();
    }
}
