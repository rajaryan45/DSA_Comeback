package com.slidingwindow;

public class MinOperations {
	public int minOperations(int[] nums, int x) {
		int total = 0;
		int res = -1;
		for(int v : nums)total += v;
		int l = 0 , r = 0;
		int y = total - x;
		total = 0;
		while(r<nums.length) {
			total += nums[r];
			
			while(l<=r && total > y) {
				total -= nums[l];
				l++;
			}
			if(total == y) {
				res = Math.max(res, r-l+1);
			}
			
			
			r++;
		}
		
		return res == -1? res:nums.length-res;
	}
}
