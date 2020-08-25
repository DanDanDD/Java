package stack;

import java.util.Stack;

/**
 * @author: Dennis
 * @date: 2020/8/25 22:51
 */

public class Offer31 {
    static boolean isValidPop2(int[] push, int[] pop) {
        int i = 0, j = 0;
        for (int temp : push){
            push[i] = temp;  // 当有元素相等时，将入栈元素的下一个提前
            while (i >= 0 && push[i] == pop[j]){
                j++; // 下一个出栈元素
                i--; // 上一个入栈元素
            }
            i++; // 下一个入栈元素
        }
        return i == 0;
    }


    static boolean isValidPop(int[] push, int[] pop) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0, j = 0; i < push.length; i++) {
            stack.push(push[i]);
            while(!stack.empty() && stack.peek() == pop[j]){
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        int[] push = {1,0};
        int[] pop = {1,0};
        System.out.println(isValidPop(push, pop));
    }
}
