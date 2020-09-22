package binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/9/18 11:23
 */

public class Offer07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList = new ArrayList<>();
        List<Integer> inorderList = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            preorderList.add(preorder[i]);
            inorderList.add(inorder[i]);
        }
        return solution(preorderList,inorderList);
    }
    public TreeNode solution (List<Integer> preorderList, List<Integer> inorderList){
        int rootVal = preorderList.remove(0);
        TreeNode root = new TreeNode(rootVal);
        int mid = inorderList.indexOf(rootVal);
        root.left = solution(preorderList,inorderList.subList(0,mid));
        root.left = solution(preorderList,inorderList.subList(mid,inorderList.size()-1));
        return root;
    }

    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }
    // preStart 前序开始   inStart 中序开始   inEnd 中序结束
    public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        //创建结点
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        //找到当前节点root在中序遍历中的位置，然后再把数组分两半
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        root.left = helper(preStart + 1, inStart, index - 1, preorder, inorder);
        root.right = helper(preStart + index - inStart + 1, index + 1, inEnd, preorder, inorder);
        return root;
    }
}
