package com.array;

import com.dp.NumOfWays;
import com.matrix.MaxMatrixSum;
import com.slidingwindow.CharacterReplacement;
import com.slidingwindow.CheckInclusion;
import com.slidingwindow.FindClosestElements;
import com.slidingwindow.MinSubArrayLen;
import com.slidingwindow.MinWindow;
import com.string.AppendCharacters;
import com.string.IsAnagram;
import com.string.IsSubsequence;
import com.string.LengthOfLastWord;
import com.string.ScoreOfString;
import com.twopointer.IsPalindrome;
import com.twopointer.Merge;

public class Main {
	

	public static void main(String[] args) {
		Merge merge = new Merge();
		int[] nums1 = {1,2,4,0,0};
		int[] nums2 = {2,3};
		int m = 3;
		int n = 2;
		merge.merge(nums1, m, nums2, n);
		for(int x:nums1) {
			System.out.println(x);
		}
		
		System.out.println();
		
//		
//		for(int x:res)
//			System.out.println(x);

	}

}
