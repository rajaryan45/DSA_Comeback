package com.twopointer;

public class MergeAlternately {
	public String mergeAlternately(String word1, String word2) {
		StringBuilder str = new StringBuilder();
		int i = 0 , j = 0 ;
		boolean w1 = true, w2 = false;
		while(i<word1.length() && j<word2.length()) {
			if(w1) {
				str.append(word1.charAt(i));
				i++;
				w1 = false;
				w2 = true;
				continue;
			}
			if(w2) {
				str.append(word2.charAt(j));
				j++;
				w1 = true;
				w2 = false;
			}
		}
		while(i<word1.length()) {
			str.append(word1.charAt(i));
			i++;
		}
			
		while(j<word2.length()) {
			str.append(word2.charAt(j));
			j++;
		}
		return str.toString();
	}
}
