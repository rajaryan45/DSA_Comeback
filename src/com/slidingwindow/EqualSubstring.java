package com.slidingwindow;

import java.util.HashSet;
//https://leetcode.com/problems/get-equal-substrings-within-budget/
public class EqualSubstring {
	public int equalSubstring(String s, String t, int maxCost) {
		int maxLength = -1;
		int l = 0 , r = 0;
		int curSum = 0 ;
		
		while(r<s.length()) {
			int costr = Math.abs(s.charAt(r)-t.charAt(r));
			
			curSum += costr;
			
			while(l<=r && curSum>maxCost) {
				int costl = Math.abs(s.charAt(l)-t.charAt(l));
				curSum -= costl;
				l++;
			}
			
			if(curSum <= maxCost) {
				maxLength = Math.max(maxLength, r-l+1);
			}
			r++;
		}
		return maxLength;
	}
}
