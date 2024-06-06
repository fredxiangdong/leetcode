package greedy;

/**
 * Created by yangxiangdong on 2024/6/6.
 */
public class maxProfit {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int maxProfit = 0;
        int lowest = prices[0];
        for(int price : prices){
            if(price < lowest){
                lowest = price;
            }
            maxProfit = Math.max(maxProfit, price - lowest);
        }
        return maxProfit;
    }
}