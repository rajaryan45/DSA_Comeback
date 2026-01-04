package com.array;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer, Integer>hmap = new HashMap<Integer, Integer>();
		for(int i = 0; i <nums.length;i++) {
			if(hmap.containsKey(target-nums[i])) {
				return new int[] {hmap.get(target-nums[i]),i};
			}else {
				hmap.put(nums[i], i);
			}
		}
		return res;
	}
}
