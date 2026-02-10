package com.linkedlistprac;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = null;
		ListNode cur = null;
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		if(list1.val < list2.val) {
			cur = list1;
			list1 = list1.next;
		}
		else {
			cur = list2;
			list2 = list2.next;
		}
		head = cur;
		while(list1 != null && list2 != null) {
			if(list1.val < list2.val) {
				cur.next = list1;
				cur = list1;
				list1 = list1.next;
			}else {
				cur.next = list2;
				cur = list2;
				list2 = list2.next;
			}
		}
		
		if(list1 != null) {
			cur.next = list1;
		}
		if(list2 != null) {
			cur.next = list2;
		}
		
		return head;
	}
}
