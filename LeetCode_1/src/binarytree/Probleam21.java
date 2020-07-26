package binarytree;

import java.util.ArrayList;

/**
 * @author: Dennis
 * @date: 2020/7/26 13:22
 */

public class Probleam21 {
    public void FindPathDFS(TreeNode root, int target,
                            ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
        if (root == null){
            return;
        }
        // 1、添加值（将当前值放入 list 待选结果集中）
        list.add(root.val);
        // 更新目标值
        target -= root.val;
        // 2、判断当前节点是否满足条件，满足则添加进结果集中
        if (root.left == null && root.right == null && target == 0){
            result.add(new ArrayList<Integer>(list));
        }
        // 3、 DFS递归统计
        FindPathDFS(root.left,target,result,list);
        FindPathDFS(root.right,target,result,list);

        // 4、回退
        list.remove(list.size()-1);
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        // target为目标值   result为结果集    list为待选结果集
        FindPathDFS(root,target,result,list);
        return result;
    }
}
