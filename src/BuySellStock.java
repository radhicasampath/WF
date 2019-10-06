public class BuySellStock {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur + (prices[i] - prices[i - 1]));
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    public int maxProfitII(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1] > prices[i])
                total += prices[i+1] - prices[i];
        }

        return total;
    }
}
