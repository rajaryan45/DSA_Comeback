package com.string;

//https://leetcode.com/problems/is-subsequence/

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		int i = 0 , j = 0 ;
		for(j = 0; j<t.length();j++) {
			if(s.charAt(i) == t.charAt(j)) {
				i++;
			}
			if(i==s.length()) return true;
		}
		
		return false;
		
	}
}
