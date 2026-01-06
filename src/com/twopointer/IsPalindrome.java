package com.twopointer;

public class IsPalindrome {
	public boolean isPalindrome(String s) {
		
		
		String reString = s.replaceAll("[-+.^:, ]","").toLowerCase();
		int n = reString.length();
		int i = 0 , j = n-1;
		if(reString.length() == 2) return reString.charAt(0)==reString.charAt(1)?true:false;
		if(reString.length() == 3) return reString.charAt(0)==reString.charAt(2)?true:false;
		
		System.out.println(reString);
		while(i<=n/2) {
			if(reString.charAt(i) != reString.charAt(j))
				return false;
			i++;
			j--;
		}
		
		return true;
	}
}
