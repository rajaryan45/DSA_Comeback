package com.array;

public class MergeTwoArrays {
	public int[] mergeSortedArrays(int[]nums1, int[]nums2) {
		int[] res = new int[nums1.length+nums2.length];
		
		int i = 0 , j = 0,k  =0 ;
		int n = nums1.length;
		int m = nums2.length;
		while(i<n && j<m) {
			if(nums1[i] >nums2[j]) {
				res[k] = nums1[i];
				i++;
			}else {
				res[k] = nums2[j];
				j++;
			}
			k++;
		}
		
		while(i<n) {
			res[k] = nums1[i];
			i++;
			k++;
		}
		while(j<m) {
			res[k] = nums2[j];
			j++;
			k++;
		}
		return res;
	}
}
