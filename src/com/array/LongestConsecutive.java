package com.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
	public int longestConsecutive(int[] nums) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: nums) {
			set.add(i);
		}
		int max = 0;
		for(Integer ele :  set) {
			int prev = ele-1;
			if(!set.contains(prev)) {
				int lent = 1;
				int next = ele+1;
				while(set.contains(next)) {
					lent++;
					next++;
				}
				max = lent>max ? lent:max;
			}
			
		}
		return max;
	}
}
