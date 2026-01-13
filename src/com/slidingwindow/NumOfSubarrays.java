package com.slidingwindow;
//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
public class NumOfSubarrays {
	public int numOfSubarrays(int[] arr, int k, int threshold) {
		int count = 0;
		int l = 0 , r = 0;
		int sum = 0;
		while(r<arr.length) {
			sum = sum + arr[r];
			if(r>=k-1) {
				if(sum/k >= threshold)count++;
				sum = sum - arr[l];
				l++;
			}
			r++;
		}
		return count;
	}
}
