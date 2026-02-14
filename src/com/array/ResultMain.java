package com.array;

public class ResultMain {
	public static void main(String[] args) {
		MergeTwoArrays mergeTwoArrays = new MergeTwoArrays();
		int[] res = mergeTwoArrays.mergeSortedArrays(new int[] {9,9,6,4}, new int[] {10,3,1});
		for(int x: res) {
			System.out.println(x);
		}
	}
}
