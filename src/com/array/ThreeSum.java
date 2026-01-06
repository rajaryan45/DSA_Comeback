package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		Map<Integer, Integer>hMap = new HashMap<Integer, Integer>();
		for(int x:nums) {
			hMap.put(x, hMap.getOrDefault(x, 0)+1);
		}
		int n = nums.length;
		for(int i = 0 ; i<n;i++) {
			hMap.put(nums[i], hMap.get(nums[i])-1);
			if(i>0 && nums[i] == nums[i-1]) continue;
			
			for(int j = i+1 ; j<n;j++) {
				hMap.put(nums[j], hMap.get(nums[j])-1);
				if(j>i+1 && nums[j] == nums[j-1]) continue;
				
				int target = -(nums[i]+nums[j]);
				if(hMap.getOrDefault(target, 0)>0) {
					resList.add(Arrays.asList(nums[i],nums[j],target));
				}
			}
			for (int j = i + 1; j < nums.length; j++) {
                hMap.put(nums[j], hMap.get(nums[j]) + 1);
            }
		}
		
		return resList;
	}
}
