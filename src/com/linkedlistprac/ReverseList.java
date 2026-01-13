package com.linkedlistprac;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		if(head == null) return null;
		if(head.next == null) return head;
		ListNode prv = head;
		ListNode temp = head.next;
		ListNode frw = temp.next;
		prv.next = null;
		while(temp!=null) {
			
			frw = temp.next;
			temp.next = prv;
			prv = temp;
			temp = frw;
			
		}
		if(frw!=null) {
			frw.next = prv;
			return frw;
		}
		
		
		return prv;
	}
}
