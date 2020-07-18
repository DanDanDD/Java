package test;

import java.util.*;

/**
 * @author: Dennis
 * @date: 2020/7/17 22:08
 */
// 判断是否有重复的数，三种实现方式
//class Solution1 {
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}

//class Solution2{   // 排序法
//    public static boolean containsDuplicate(int[] nums){
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == nums[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }
//}
class Solution3{   // 哈希表实现
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) {
            return true;
            }
            set.add(x);
        }
        return false;
    }
}



public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] demo1 = new int[]{1,2,3,4,7,8,9,0,11,22,33,5,1};

        System.out.println(Solution3.containsDuplicate(demo1));
    }
}
