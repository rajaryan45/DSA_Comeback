package com.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> resIntegers = new ArrayList<Integer>();
		int l = 0 , r = arr.length-1;
		while((r-l+1)>k) {
			if(Math.abs(arr[l]-x) <= Math.abs(arr[r]-x)) {
				r--;
			}else {
				l++;
			}
		}
		for(int i = l ;i<r+1;i++)
			resIntegers.add(arr[i]);
		
		return resIntegers;
	}
}
