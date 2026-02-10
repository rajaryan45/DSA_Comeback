package com.linkedlistprac;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		
		ListNode headListNode = null;
		ListNode first = null, second = null;
		if(l1 != null) {
			headListNode = l1;
			first = l1;
			second = l2;
		}else {
			headListNode = l2;
			first = l2;
			second = l1;
		}
		ListNode prev = null;
		while(first != null && second != null) {
			int val = second.val + first.val + carry;
			first.val = val % 10;
			carry = val / 10;
			prev = first;
			first = first.next;
			second = second.next;
		}
		
		while(first != null) {
			int val = first.val + carry;
			first.val = val% 10;
			carry = val / 10;
			prev = first;
			first = first.next;
		}
		
		while(second != null) {
			int val = second.val + carry;
			prev.next = second;
			second.val = val % 10;
			carry = val / 10;
			prev = second;
			second = second.next;
		}
		if(carry != 0) {
			prev.next = new ListNode(carry, null);
		}
		
		return headListNode;
	}
}
