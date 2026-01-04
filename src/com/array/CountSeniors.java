package com.array;
//https://leetcode.com/problems/number-of-senior-citizens/
public class CountSeniors {
	public int countSeniors(String[] details) {
		int count = 0 ;
		for(int i = 0 ; i<details.length;i++) {
			int age = Integer.parseInt(details[i].substring(11, 13));
			if(age>60) count++;
		}
		return count;
	}
}
