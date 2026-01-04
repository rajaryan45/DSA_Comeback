package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	private String getkey(String s) {
	    int[] freq = new int[26];

	    for (char c : s.toCharArray()) {
	        freq[c - 'a']++;
	    }

	    StringBuilder key = new StringBuilder();
	    for (int f : freq) {
	        key.append('#').append(f);
	    }

	    return key.toString();
	}
	public List<List<String>> groupAnagrams(String[] strs){
		 List<List<String>> res = new ArrayList<List<String>>();
		 Map<String, List<String>> map = new HashMap<String, List<String>>();
		 for(int i = 0 ; i<strs.length;i++) {
			 String key = getkey(strs[i]);
			 if (!map.containsKey(key)) {
				    map.put(key, new ArrayList<>());
				}
				map.get(key).add(strs[i]);

		 }
		 
		 for (Map.Entry<String, List<String>> entry : map.entrySet())
			   res.add(entry.getValue());
		 return res;
	 }
}
