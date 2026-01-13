package com.twopointer;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int i =0 , j = 0;
		for(;j<nums.length;j++) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}
}
