package com.slidingwindow;

import java.util.HashMap;

//https://leetcode.com/problems/permutation-in-string/
public class CheckInclusion {
	
	private boolean checkSubstring(String subString, int[] map) {
		int[] chk = map.clone();
//		chk[subString.charAt(0)-'a']--;
		int i = 0;
		for(i = 0 ; i<subString.length();i++) {
			if(chk[subString.charAt(i)-'a']<=0) 
				return false;
			else {
				chk[subString.charAt(i)-'a']--;
			}
		}
		return true;
	}
	
	/*
	 * public boolean checkInclusion(String s1, String s2) { if(s1.length() >
	 * s2.length()) return false; if(s1.length()==1) return
	 * s2.indexOf(s1.charAt(0))!=-1?true:false; int[] sub = new int[26]; int[] str =
	 * new int[26];
	 * 
	 * int n1 = s1.length(); int n2 = s2.length(); for(int i = 0 ; i < n1;i++) {
	 * sub[s1.charAt(i)-'a']++; } for(int i = 0 ; i<n2;i++) {
	 * if(sub[s2.charAt(i)-'a']>0) { if(i+n1-1 <= n2-1) { boolean val =
	 * checkSubstring(s2.substring(i,i+n1),sub ); if(val)return true; }
	 * 
	 * } }
	 * 
	 * return false; }
	 */
	
	 public boolean checkInclusion(String s1, String s2) {
	        if (s1.length() > s2.length()) return false;
	        HashMap<Character, Integer> need = new HashMap<>();
	        HashMap<Character, Integer> window = new HashMap<>();
	        for (int i = 0; i < s1.length(); i++) {
	            char c = s1.charAt(i);
	            need.put(c, need.getOrDefault(c, 0) + 1);
	        }
	        for (int i = 0; i < s1.length(); i++) {
	            char c = s2.charAt(i);
	            window.put(c, window.getOrDefault(c, 0) + 1);
	        }
	        if (need.equals(window)) return true;
	        for (int right = s1.length(); right < s2.length(); right++) {
	            char add = s2.charAt(right);
	            window.put(add, window.getOrDefault(add, 0) + 1);
	            char remove = s2.charAt(right - s1.length());
	            if(right == 2||right == 3||right == 4||right == 5)
	            	System.out.println("chek");
	            window.put(remove, window.get(remove) - 1);
	            if (window.get(remove) == 0) 
	            	window.remove(remove);
	            if (need.equals(window)) 
	            	return true;
	        }
	        return false;
	    }
}
