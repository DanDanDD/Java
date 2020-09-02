package array;

/**
 * @author: Dennis
 * @date: 2020/8/31 22:44
 */
// 删除排序数组中的重复项
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        // i为慢指针   j为快指针
        // 数组首部存放无重复的元素
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
