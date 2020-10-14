package offer;

/**
 * @author: Dennis
 * @date: 2020/10/11 9:46
 */

// 求连续子数组的最大和

public class Offer_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        // 1、定义状态 （以dp[i] 为最大连续子序列的和）
        // 2、定义递推公式 dp[i] = max(f(i-1)+array[i], array[i])
        // 3、状态初始化 dp[0] = array[0], max = array[0]
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            dp[i] = Math.max(dp[i-1] + array[i],array[i]);
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }


    // 解法2：
    public int FindGreatestSumOfSubArray2(int[] nums) {
        int temp = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(temp > 0){
                // temp 为 子序列和，当temp<0 时，舍弃子序列，从下标为i处，计算新的子序列
                temp = temp + nums[i];
            }else{
                temp = nums[i];
            }
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}
