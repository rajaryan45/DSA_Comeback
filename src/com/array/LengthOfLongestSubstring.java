package com.array;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		if(s.length()==0) return 0;
		if(s.length()==1) return 1;
		if(s.length()==2) return (s.charAt(0)!= s.charAt(1))?2:1;
		int max = 0 ; 
		int i = 0,j=1;
		Set<Character>set = new HashSet<Character>();
		set.add(s.charAt(i));
		for(j = 1;j<s.length();j++) {
			char ch = s.charAt(j);
			while(set.contains(ch)) {
					set.remove(s.charAt(i));
					i++;
			}	
			
			set.add(s.charAt(j));
			max = max>(j-i+1)?max:(j-i+1);
		}
		
		
		
		return max;
	}
}
