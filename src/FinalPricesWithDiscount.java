public class FinalPricesWithDiscount {
    public int[] finalPrices(int[] prices) {
        int i =0;
        int j = 1;
        while (i<prices.length){
            if (i==prices.length-1){
                break;
            }
            if (j<prices.length && prices[i]>=prices[j]){
                prices[i] = prices[i] - prices[j];
                i++;
                j = i+1;
            } else if (j==prices.length-1){
                i++;
                j= i+1;
            } else {
            j++;
            }
        }
        return prices;
    }
    public static void main(String[] args) {
     int prices[] = {8,4,6,2,3} ;
     int res[] = (new FinalPricesWithDiscount().finalPrices(prices));
        for(int n: res){
            System.out.println(n);
        }
    }
}
