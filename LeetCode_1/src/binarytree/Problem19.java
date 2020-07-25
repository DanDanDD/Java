package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Dennis
 * @date: 2020/7/25 17:48
 */

public class Problem19 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null){
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode head = queue.poll();
            result.add(head.val);
            if (head.left != null){
                queue.offer(head.left);
            }
            if (head.right != null){
                queue.offer(head.right);
            }
        }
        return result;
    }
}
