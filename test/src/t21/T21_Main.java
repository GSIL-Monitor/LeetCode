package t21;

import t17.ListNode;

/**
 * @author yukunlee
 * @Description Given a singly linked list L: L 0¡úL 1¡ú¡­¡úL n-1¡úL n,reorder it to: L 0¡úL n ¡úL 1¡úL n-1¡úL 2¡úL n-2¡ú¡­
 * @date 2018Äê9ÔÂ27ÈÕ
 */
public class T21_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l0 = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);

		
		l0.next = l1; l1.next = l2; l2.next = l3;
		
//		T21_Solution s = new T21_Solution();
//		s.reorderList(l0);
		
		T21_Solution_1 s = new T21_Solution_1();
		s.reorderList(l0);
		
		try {
			System.out.println(l0.next.val);
			System.out.println(l1.next.val);
			System.out.println(l2.next.val);
			System.out.println(l3.next.val);
		}catch(Exception e) {
			
		}
		


	}

}
