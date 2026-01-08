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

public class Main {
	

	public static void main(String[] args) {
		FindClosestElements findClosestElements = new FindClosestElements();
		int [][] res = {{1,2,3},{-1,-2,-3},{1,2,3}};
		System.out.println(findClosestElements.findClosestElements(new int[] {-3,-2,1,2,3,4,5},6, 3));
		
		
		
//		
//		for(int x:res)
//			System.out.println(x);

	}

}
