class Solution {
    public int maxProfit(int[] prices) {
        // int min = prices[0];
        // int minIndex = 0;
        // for(int i = 0; i < prices.length;i++){
        //     if(prices[i] < min){
        //         min = prices[i];
        //         minIndex = i;
        //     }
        // }
        
        // int max = min;
        // for(int i = minIndex ; i < prices.length;i++){
        //     if(prices[i] > max){
        //         max = prices[i];
        //     }
        // }
        // if(max <= min){
        //     return 0;
        // }
        // return max - min;


        
        int min = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            } 
            else {
                int profit = prices[i] - min;

                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}

