package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		Set<Integer>set = new HashSet<Integer>();
		for(int x: nums) {
			if(!set.add(x)) return true;
		}
		return false;
	}
}
