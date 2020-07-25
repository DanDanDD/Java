package stack;

import java.util.Stack;

/**
 * @author: Dennis
 * @date: 2020/7/25 15:26
 */

public class Problem18 {
    public boolean IsPopOrder(int [] pushA, int [] popA){
        if (pushA == null || popA == null ||
                pushA.length == 0|| popA.length == 0 || pushA.length != popA.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        for ( ; i < pushA.length; i++){
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek() == popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}
