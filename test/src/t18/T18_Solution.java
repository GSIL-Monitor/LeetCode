package t18;

import t17.ListNode;

public class T18_Solution {
	public ListNode insertionSortList(ListNode head) {
		if(head.next == null) {
			return head;
		}
		ListNode list = new  ListNode(0);
		ListNode cur = new  ListNode(0);
		list.next = head;
		head = head.next;
		list.next.next = null;
		
		while(head != null) {
			cur = head;
			head = head.next;
			
			list.next = insert(list.next , cur);
			}
		return list.next;
	}
	
	public ListNode insert(ListNode list , ListNode n) {
		ListNode prehead = list;
		if (n.val < list.val) {
			n.next = list;
			return n;
		} else {
			while (list != null) {
				if (list.val < n.val && (n.val <= list.next.val || list.next == null)) {
					n.next = list.next;
					list.next = n;
					break;
				}
				list = list.next;
				
			}
			return prehead;
		}

	}

}
