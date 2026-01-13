package com.slidingwindow;
//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
public class MinimumRecolors {
	public int minimumRecolors(String blocks, int k) {
		int minWindow = blocks.length()+1;
		int l = 0, r = 0;
		int count = 0;
		while(r < blocks.length()) {
			if(blocks.charAt(r) == 'W') count++;
			if(r-l+1 >= k)
				minWindow = minWindow>count?count:minWindow;
			if(r>= k -1) {
				if(blocks.charAt(l) == 'W') count--;
				l++;
			}
			
			
			r++;
			
		}
		return minWindow;
	}
}
