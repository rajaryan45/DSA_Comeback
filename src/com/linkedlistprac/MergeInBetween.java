package com.linkedlistprac;
//https://leetcode.com/problems/merge-in-between-linked-lists/description/
public class MergeInBetween {
	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		int count = 1;
		ListNode head = list1;
		ListNode prev = null;
		while(count!=a) {
			prev = list1;
			list1 = list1.next;
			count++;
		}
		ListNode frw = list1.next;
		list1.next = list2;
		while(list2.next!=null)
			list2 = list2.next;
		list1 = frw;
		while(count!=b&&list1!=null) {
			prev = list1;
			list1 = list1.next;
			count++;
		}
		if(list1!=null)
			list2.next = list1.next;
		
		return head;
		
	}
}
