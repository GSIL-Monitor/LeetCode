package t18;

import t17.ListNode;

public class T18_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T18_Solution s = new T18_Solution();
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(4);
		l2.next = l1;
		l3.next = l2;
		
		s.insertionSortList(l3);
		
		System.out.println(l1.next.val);
		System.out.println(l2.next.val);
		System.out.println(l3.val);

	}

}
