package level_easy;

public class StockMaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices={2,4,1};
		int maxVal=maxProfit(prices);
		System.out.println(maxVal);
	}
	
	public static int maxProfit(int[] prices) {
		if(prices.length<2)
            return 0;
		int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else if (prices[i] > min) max = Math.max(prices[i] - min, max);
        }
        return max;
	}

}
