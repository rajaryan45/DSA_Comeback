package com.array;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

/*
 *   https://leetcode.com/problems/plus-one/description/?envType=daily-question&envId=2026-01-01
 *   
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		int val = 0 , c = 0;
		int n = digits.length-1;
		if(digits[n]!=9) {
			digits[n] +=1;
			return digits;
		}else {
			while(n>=0 && digits[n]==9) {
				digits[n] = 0;
				n--;
				
			}
			if(n<0) {
				int[] result = new int[digits.length+1];
				result[0] = 1;
				return result;
			}else {
				digits[n]+=1;
			}
		}
		
		return digits;
        
    }
}
