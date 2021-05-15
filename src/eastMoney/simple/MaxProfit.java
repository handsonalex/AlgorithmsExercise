package eastMoney.simple;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(price,minPrice);
            maxProfit = Math.max(price - minPrice , maxProfit);
        }
        return maxProfit;
    }
}
