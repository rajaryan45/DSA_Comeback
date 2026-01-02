package com.array;

public class RepeatedNTimes {
	public int repeatedNTimes(int[] nums) {
//		int[] map = new int[10001];
		boolean[] seen = new boolean[10001];
		int n = nums.length/2;
		for(int x:nums) {
//			map[x]++;
//			if(map[x]>0)return x;
			if(seen[x])return x;
			seen[x] = true;
		}
		
		return nums[0];
	}
}
