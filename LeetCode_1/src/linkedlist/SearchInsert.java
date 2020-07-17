package linkedlist;

/**
 * @author: Dennis
 * @date: 2020/7/17 23:33
 */

// LeetCode 35 搜索插入位置
class Solution2{
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (mid == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return left;
    }
}
public class SearchInsert {
}
