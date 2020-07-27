package array;

/**
 * @author: Dennis
 * @date: 2020/7/27 16:19
 */

public class Probleam25 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        // 1、定义状态 （以dp[i] 为最大连续子序列的和）
        // 2、定义递推公式 dp[i] = max(f(i-1)+array[i], array[i])
        // 3、状态初始化 f(0) = array[0], max = array[0]
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int max_value = array[0];
        for (int i = 1; i < array.length; i++) {
            dp[i] = Math.max(array[i], dp[i-1]+array[i]);
            if (max_value < dp[i]){
                max_value = dp[i];
            }
        }
        return max_value;
    }

    // 优化版本
    public static int FindGreatestSumOfSubArray2(int[] array) {
        int temp = array[0];
        int max_value = array[0];

        for (int i = 1; i < array.length; i++) {
            if (temp >= 0){
                temp += array[i];
            }else {
                temp = array[i];
            }
            if (max_value < temp){
                max_value = temp;
            }
        }
        return max_value;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(arr));
        System.out.println(FindGreatestSumOfSubArray2(arr));

    }
}
