package com.slidingwindow;
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
public class MaxVowels {
	private boolean checkVowel(char c) {
		return (c == 'a')||( c =='e')||(c == 'i')||(c == 'o')||(c == 'u');
	}
	public int maxVowels(String s, int k) {
		int l = 0 , r =0;
		int max = 0,count = 0;
		while(r<s.length()) {
			if(checkVowel(s.charAt(r)))count++;
			
			if(r>=k-1) {
				max = max>count?max:count;
				if(checkVowel(s.charAt(l))) {
					count--;
				}
				l++;
			}
			r++;
		}
		return max;
	}
}
