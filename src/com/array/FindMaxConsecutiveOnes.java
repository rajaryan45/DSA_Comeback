package com.array;
//https://leetcode.com/problems/max-consecutive-ones/
public class FindMaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0,curr =0;
		for(int i = 0 ; i<nums.length;i++) {
			if(nums[i]==1) {
				curr++;
			}else {
				max = max>curr ?max:curr;
				curr = 0;
			}
		}
		return max>curr?max:curr;
	}
}
