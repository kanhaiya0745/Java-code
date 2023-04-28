// calculating maximum price of a given stock ;


public class pr_03 {
    public static int calculating_stock_profit(int stock_prices[]){
        
        int buyPrice = stock_prices[0];
        int max_profit =0;

        for(int i =1; i<stock_prices.length; i++){
            if(buyPrice<stock_prices[i]){
                int profit = stock_prices[i]- buyPrice; /*Today profit */

                max_profit = Math.max(max_profit, profit); // calculating max profit
            }
            else{
                buyPrice = stock_prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
       int stock_prices[] = {7,1,5,3,6,4};
      // int stock_prices[] = {7,6,4,3,2,1};

       System.out.println("The maximum profit of  a stock "+calculating_stock_profit(stock_prices));
    }
    
}
