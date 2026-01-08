package com.slidingwindow;

import java.util.HashMap;

public class MinWindow {
	public String minWindow(String s, String t) {
		if(t.length()>s.length()) return"";
		if(t.length()==1 && s.length() ==1 && t.charAt(0) == s.charAt(0)) 
			return t ; 
		else if(t.length()==1 && s.length() ==1 && t.charAt(0) != s.charAt(0)) {
			return "";
		}
		int min = Integer.MAX_VALUE;
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		for(int i = 0 ; i<t.length();i++) {
			hMap.put(t.charAt(i), hMap.getOrDefault(t.charAt(i), 0)+1);
		}
		int l=0,r=0;
		HashMap<Character, Integer>check = new HashMap<Character, Integer>();
		int need = hMap.size();
		int have = 0 ;
		int[] res = {-1,-1};
		for(;r<s.length();r++) {
			char ch = s.charAt(r);
			
			check.put(ch,check.getOrDefault(ch, 0)+1);
			
			if(hMap.containsKey(ch) && check.get(ch).equals(hMap.get(ch))) {
				have++;
			}
			
			while(have == need) {
//				min = ?(r-l+1):min;
				if((r-l+1)<min) {
					min = r-l+1;
					res[0]= l;
					res[1] = r;
					
				}
				char lChar = s.charAt(l);
				
				check.put(lChar, check.getOrDefault(lChar, 0)-1);
				
				if(hMap.containsKey(lChar) && check.get(lChar) < hMap.get(lChar))
					have--;
				l++;

				
			}
			
		}
		
		
		return min == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
	}
}
