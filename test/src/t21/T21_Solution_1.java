package t21;

import java.util.Stack;

import t17.ListNode;

/**
 * @author yukunlee
 * @Description Given a singly linked list L: L 0��L 1������L n-1��L n,reorder it to: L 0��L n ��L 1��L n-1��L 2��L n-2����
 * @date 2018��9��27��
 */
public class T21_Solution_1 {
	public void reorderList(ListNode head) {

		if (head == null || head.next == null) {

		} else {
			Stack<ListNode> st = new Stack<>();
	
			ListNode fast = new ListNode(0);
			ListNode slow = new ListNode(0);

			fast = head;
			slow = head;

			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
			fast = slow.next;
			slow.next = null;
			slow = fast;
			
			while(slow != null) {
				st.push(slow);
				slow = slow.next;
			}
			
			while(head != null && !st.empty()) {
				fast = st.pop();
				fast.next = head.next;
				head.next = fast;
				head = fast.next;
			}

		
		}

	}

}
