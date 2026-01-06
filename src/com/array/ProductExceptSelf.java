package com.array;

public class ProductExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int  n = nums.length;
		int[] pre = new int[n];
		int[] suf = new int[n];
		pre[0] = 1;
		suf[n-1] = 1;
		for(int i = 1 ; i < n;i++) {
			pre[i] = nums[i-1] * pre[i-1];
			suf[n-i-1] = suf[n-i] * nums[n-i];
		}
		for(int i = 0 ; i<n ; i++) {
			nums[i] = pre[i] * suf[i];
		}
		return nums;
	}
}
