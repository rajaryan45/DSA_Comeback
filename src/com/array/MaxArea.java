package com.array;

//https://leetcode.com/problems/container-with-most-water/
public class MaxArea {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int r = height.length-1;
		int l = 0 ;
		while(l<r){
			int dist = r-l;
			int area = Math.min(height[l], height[r]) * dist;
			maxArea = maxArea>area?maxArea:area;
			if(height[l]<=height[r]) {
				l++;
			}else {
				r--;
			}
			
		}
		
		return maxArea;
	}
}
