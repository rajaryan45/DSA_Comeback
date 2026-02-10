package com.linkedlistprac;
//https://leetcode.com/problems/merge-nodes-in-between-zeros/
public class MergeNodes {
	public ListNode mergeNodes(ListNode head) {
		ListNode left = head;
		ListNode right = head.next;
		int sum = 0 ;
		while(right!=null) {
			if(right.val != 0) {
				sum += right.val;
			}else {
				left.val = sum;
				sum = 0 ;
				if(right.next!=null)
					left.next = right;
				else {
					left.next = null;
				}
				left = right;
			}
			right = right.next;
		}
		
		return head;
	}
}
