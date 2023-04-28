public class BuyAnd_sell_13 {
    public static int Buy_and_sell_stock(int prices[]){
        //int buyPrice = Integer.MAX_VALUE;

        int buyPrice = prices[0];
        int max_profit = 0;

        for(int i = 1; i<prices.length; i++){
            if(buyPrice<prices[i]){   // profit;
                int profit = prices[i] - buyPrice;  // today profit;
                max_profit = Math.max(max_profit, profit); // maximum profit is finding;
            }
            else{
                buyPrice = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("The maximum profit is "+(Buy_and_sell_stock(prices)));

    }
}
