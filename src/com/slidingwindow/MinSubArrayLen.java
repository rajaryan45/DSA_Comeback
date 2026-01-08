package com.slidingwindow;
//https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinSubArrayLen {
	public int minSubArrayLen(int target, int[] nums) {
		int minLength = Integer.MAX_VALUE;
		int l = 0 , r= 0 ;
		int sum = 0 ;
		for(;r<nums.length;r++) {
			sum = sum + nums[r];
			while(sum>= target) {
				int len = r-l+1;
				minLength = minLength<len?minLength:len;
				sum = sum-nums[l];
				l++;
			}
		}
		return minLength==Integer.MAX_VALUE?0:minLength;
	}
}
