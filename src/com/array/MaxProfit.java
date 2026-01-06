package com.array;

public class MaxProfit {
	public int maxProfit(int[] prices) {
		int max = 0;
		int curr = 0;
		for(int i=1,j = 0 ; i<prices.length;i++) {
			curr = prices[i] - prices[j];
			if(curr<0) {
				j = i;
				curr = 0;
			}else {
				max = max>curr ? max:curr;
			}
		}
		return max;
	}
}
