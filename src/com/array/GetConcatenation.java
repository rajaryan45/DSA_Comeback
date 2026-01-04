package com.array;

public class GetConcatenation {
	public int[] getConcatenation(int[] nums) {
		int[] res = new int[nums.length*2];
		System.arraycopy(nums, 0, res, 0, nums.length);
		System.arraycopy(nums, 0, res, nums.length, nums.length);
		return res;
	}
}
