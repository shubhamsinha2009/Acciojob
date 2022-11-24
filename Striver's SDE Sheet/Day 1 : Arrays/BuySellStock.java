
class Solution {
    public int maxProfit(int[] prices) {

      int min = prices[0];
   
      int maxProfit =0;

        for(int i =1 ;i<prices.length ; i++){

           int profit = prices[i] - min ;


           if(profit<0){
               min = prices[i];
           } else if(maxProfit < profit ){
               maxProfit = profit;
           }

        }

        return maxProfit;
        
    }
}
