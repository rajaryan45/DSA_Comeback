package com.linkedlistprac;

import java.util.Deque;
import java.util.LinkedList;
//https://leetcode.com/problems/palindrome-linked-list/
public class IsPalindrome {
	public boolean isPalindromeI(ListNode head) {
		Deque<Integer> deque = new LinkedList<Integer>();
		while(head != null) {
			deque.addLast(head.val);
			head = head.next;
		}
		while(!deque.isEmpty()) {
			if(deque.getFirst() != deque.getLast())
				return false;
			deque.removeFirst();
			if(!deque.isEmpty())
				deque.removeLast();
		}
		return true;
		
	}
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) return true;
		ListNode slowListNode = head;
		ListNode fastListNode = head;
		ListNode prevNode = null;
		while(fastListNode != null && fastListNode.next != null) {
			fastListNode = fastListNode.next.next;
			ListNode temp = slowListNode.next;
			slowListNode.next = prevNode;
			prevNode = slowListNode;
			slowListNode = temp;
		}
		
		if(fastListNode != null)
			slowListNode = slowListNode.next;
		
		
		while(slowListNode != null && prevNode != null) {
			if(slowListNode.val != prevNode.val)return false;
			
			slowListNode = slowListNode.next;
			prevNode = prevNode.next;
		}
		return true;
			
	}
}
