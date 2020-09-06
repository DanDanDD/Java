package array;

/**
 * @author: Dennis
 * @date: 2020/9/6 16:17
 */

public class Offer21 {
    // 适用于 牛客网的剑指offer 14题
    // 不改变 奇偶数原始顺序
    public int[] exchange1(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            // 遇到偶数跳过，遇到奇数进行操作
            if ((nums[i] & 1) == 1){
                // 保存奇数的值
                int temp = nums[i];
                // 保存 奇数所在的位置
                int j = i;

                while (j > k){
                    // 将偶数向后搬移
                    nums[j] = nums[j-1];
                    j--;
                }
                // k 为奇数前叉标志位
                nums[k++] = temp;
            }
        }
        return nums;
    }
    // 双指针法解决
    public int[] exchange2(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int temp = 0;
        while(i < j){
            while(i < j && (nums[i] & 1) == 1){
                i++;
            }
            while(i < j && (nums[j] & 1) == 0){
                j--;
            }
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
