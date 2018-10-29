package t36;


public class T36_Solution {
	/**
	 * @author yukunlee
	 * @Description best-time-to-buy-and-sell-stock-iii
	 * @date 2018年10月25日
	 */
	public int maxProfit3(int[] prices) {
		int len = prices.length;
		int buy1 = Integer.MIN_VALUE,sell1= 0, buy2= Integer.MIN_VALUE, sell2 = 0;
		for(int i = 0 ; i < len ;++i) {
			buy1 = Math.max(buy1, -prices[i]);
			sell1 = Math.max(sell1, prices[i] + buy1);
			buy2 = Math.max(buy2, sell1-prices[i]);
			sell2 = Math.max(sell2, prices[i]+buy2);
		}
		return sell2;
	}
	
	/**
	 * @author yukunlee
	 * @Description best-time-to-buy-and-sell-stock-ii
	 * @date 2018年10月29日
	 * @param prices
	 * @return
	 */
	public int maxProfit1(int[] prices) {
		int buy = Integer.MIN_VALUE, sell = 0;
		int len = prices.length;
		for(int i = 0 ; i < len ; ++i) {
			buy = Math.max(buy, -prices[i]);
			sell = Math.max(buy, sell + buy);
		}
		return sell;	
	}
	
}
