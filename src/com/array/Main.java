package com.array;

import java.util.Iterator;
import java.util.List;

import com.binarysearch.SeparateSquares;
import com.dp.NumOfWays;
import com.linkedlistprac.LinkedListBuilder;
import com.linkedlistprac.ListNode;
import com.linkedlistprac.ReverseList;
import com.matrix.MaxMatrixSum;
import com.slidingwindow.CharacterReplacement;
import com.slidingwindow.CheckInclusion;
import com.slidingwindow.FindClosestElements;
import com.slidingwindow.LongestOnes;
import com.slidingwindow.MaxSlidingWindow;
import com.slidingwindow.MinSubArrayLen;
import com.slidingwindow.MinWindow;
import com.slidingwindow.MinimumRecolors;
import com.slidingwindow.NumOfSubarrays;
import com.string.AppendCharacters;
import com.string.IsAnagram;
import com.string.IsSubsequence;
import com.string.LengthOfLastWord;
import com.string.ScoreOfString;
import com.twopointer.IsPalindrome;
import com.twopointer.Merge;
import com.twopointer.MoveZeroes;
import com.twopointer.RemoveDuplicates;
import com.twopointer.Rotate;
import com.twopointer.ValidPalindromeII;

public class Main {

	public static void main(String[] args) {
		LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
		ListNode headListNode = linkedListBuilder.listBuilder(new int[] {1,2,3,4,5});
		ReverseList reverseList = new ReverseList();
		headListNode = reverseList.reverseList(headListNode);
		while(headListNode!=null) {
			System.out.print(headListNode.val + " ");
			headListNode = headListNode.next;
		}
			
			
		System.out.println();

		
		  
		 

//		
//		for(int x:res)
//			System.out.println(x);

	}

}
