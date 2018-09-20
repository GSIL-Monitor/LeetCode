package t17;


// 单链表的快速排序 时间复杂度O(nlogn),空间复杂度O(1)
public class T17_Solution {
    public ListNode sortList(ListNode head) {
        quickSort(head, null);
        return head;
    }
 
    public static void quickSort(ListNode head, ListNode end) {
        if(head != end) {
            ListNode partion = partion(head);
            quickSort(head, partion);
            quickSort(partion.next, end);
        }
    }
 
    public static ListNode partion(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            if(fast.val < head.val) {
                slow = slow.next;
                fast.val = slow.val ^ fast.val ^ (slow.val = fast.val);
            }
            fast = fast.next;
        }
        slow.val = head.val ^ slow.val ^ (head.val = slow.val);
        return slow;
    }
}