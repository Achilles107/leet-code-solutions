public class BuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(new BuyAndSellStocks().maxProfit(arr));
    }
}
