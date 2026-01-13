package com.twopointer;
//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
	public boolean validPalindrome(String s) {
		int i = 0,count = 0;
		int j = s.length()-1;
		if(s.length()==1) return true;
		if(s.length()==2) return true;
		for(;i<=s.length()/2;i++,j--) {
			if(count<=1) {
				if(s.charAt(i) != s.charAt(j) ) {
					count++;
					if(s.charAt(i) != s.charAt(j-1) || s.charAt(i+1) != s.charAt(j)) {
						count++;
					}
				}
			}else {
				break;
			}
		}
		return count<=1?true:false;
	}
}
