package dynamicProgram;

/**
 * @author: Dennis
 * @date: 2019/11/26 23:01
 */

public class maxPrices {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (max <= (prices[j] - prices[i])) {
                    max = (prices[j] - prices[i]);
                }
            }
        }
        return max;
    }
}
