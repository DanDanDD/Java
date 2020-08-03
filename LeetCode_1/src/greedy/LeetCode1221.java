package greedy;

/**
 * @author: Dennis
 * @date: 2020/8/3 23:47
 */

public class LeetCode1221 {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'L'){
                balance--;
            }
            if (s.charAt(i) == 'R'){
                balance++;
            }
            if (balance == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "LLRRLRLLRLRR";
        System.out.println(balancedStringSplit(s));
    }
}
