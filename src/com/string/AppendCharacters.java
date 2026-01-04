package com.string;
//https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
public class AppendCharacters {
	public int appendCharacters(String s, String t) {
		int i = 0 , j = 0 ; 
		int tlen  = t.length() , slen = s.length();
		for(j = 0; j<tlen&&i<slen;j++) {
			if(t.charAt(i) == s.charAt(j)) {
				i++;
			}
		}
		return tlen-i;
	}
}
