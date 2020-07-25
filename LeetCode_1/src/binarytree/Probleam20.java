package binarytree;

import java.util.ArrayList;

/**
 * @author: Dennis
 * @date: 2020/7/25 18:46
 */

public class Probleam20 {

    public static boolean VerifySquenceOfBSTHelper(int[] sequence, int start, int end){
        if(start >= end){
            return true;
        }

        int i = start;
        int root = sequence[end];
        while(i < end && sequence[i] < root){ // 左子树 全部小于 根节点
            i++;
        }
        for(int j = i; j < end; j++){ // 右子树 大于 根节点
            if(sequence[j] < root){
                return false;
            }
        }
        return VerifySquenceOfBSTHelper(sequence,start,i-1) &&
                VerifySquenceOfBSTHelper(sequence,i,end-1);
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence == null || sequence.length == 0){
            return false;
        }
        return VerifySquenceOfBSTHelper(sequence,0,sequence.length-1);
    }

    public static void main(String[] args) {
        int[] b = new int[]{1,10,3,6,7,8,4};
        System.out.println(VerifySquenceOfBST(b));

    }
}
