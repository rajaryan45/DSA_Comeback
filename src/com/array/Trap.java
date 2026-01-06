package com.array;
//https://leetcode.com/problems/trapping-rain-water/
public class Trap {
	public int trap(int[] height) {
		int res = 0 ;
		int[]preMax = new int[height.length];
		int[]suffMax = new int[height.length];
		preMax[0] = height[0];
		suffMax[height.length-1] = height[height.length-1];
		for(int i = 1 ; i<height.length;i++) {
			preMax[i] = height[i]>preMax[i-1]?height[i]:preMax[i-1];
		}
		for(int i = height.length-2;i>=0;i--) {
			suffMax[i] = height[i]>suffMax[i+1]?height[i]:suffMax[i+1];
		}
		for(int i = 0 ; i<height.length;i++) {
			int minHeight = preMax[i]<suffMax[i]?preMax[i]:suffMax[i];
			res = res + minHeight - height[i];
		}
		
		return res;
	}
}
