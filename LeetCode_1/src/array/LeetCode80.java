package array;

/**
 * @author: Dennis
 * @date: 2020/8/31 23:34
 */
// 删除有序数组中的重复项，每个元素最多出现两次
// https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
public class LeetCode80 {

    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            }else {
                count = 1;
            }

            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}

