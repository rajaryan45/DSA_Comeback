package com.linkedlistprac;
//https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveElements {
	public ListNode removeElementsI(ListNode head, int val) {
		if(head == null) return head;
		ListNode dummyHead = new ListNode(0, head);
		ListNode point = head;
		ListNode prev = dummyHead;
		while(point != null) {
			if(point.val == val) {
				prev.next = point.next;
				point = point.next;
			}else {
				prev = point;
				point = point.next;
			}
		}
		
		return dummyHead.next;
	}
	public ListNode removeElements(ListNode head, int val) {
		if(head == null) return head;
		ListNode node = removeElements(head.next, val);
		if(head.val == val)
			return node;
		head.next = node;
		return head;
	}
}
