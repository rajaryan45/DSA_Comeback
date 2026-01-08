package com.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CharacterReplacement {
	public int characterReplacement(String s, int k) {
		int max = 0 ,res = 0;
		int[]arr = new int[26];
		int r = 0 , l = 0;
		HashMap<Character, Integer>hMap = new HashMap<Character, Integer>();
		for(r =0;r<s.length();r++) {
			char ch = s.charAt(r);
			hMap.put(ch, hMap.getOrDefault(ch, 0)+1);
			max = Math.max(max, hMap.get(ch));
			while((r-l+1)-max>k) {
				char lch = s.charAt(l);
				hMap.put(lch, hMap.get(lch)-1);
				l++;
			}
			res = Math.max(res, (r-l+1));
		}
		return res;
	}
}
