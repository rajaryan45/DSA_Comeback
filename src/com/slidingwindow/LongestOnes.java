package com.slidingwindow;
//https://leetcode.com/problems/max-consecutive-ones-iii/description/m
public class LongestOnes {
	public int longestOnes(int[] nums, int k) {
		int max = 0;
		int l = 0 , r = 0;
		int count = 0;
		for(;r<nums.length;r++) {
			if(nums[r] == 0)count++;
			while(count>k) {
				if(nums[l] == 0)count--;
				l++;
			}
			max = (r-l+1)> max ?(r-l+1):max;
		}
		
		return max;
	}
}
