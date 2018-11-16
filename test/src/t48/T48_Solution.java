package t48;

import t17.ListNode;

public class T48_Solution {
	/**
	 * @author yukunlee
	 * @Description quicksort
	 * @date 2018年11月15日
	 * @param arr
	 * @return
	 */
	public int[] Solution(int[] arr) {
		return helper(arr, 0, arr.length-1);
	}

	private int[] helper(int[] arr, int head, int tail) {
		if (head > tail)
			return arr;
		int cur = head;
		int val;
		for (int i = head; i <= tail; ++i) {
			if (arr[i] < arr[cur]) {
				val = arr[i];
				for(int j = i ; j > cur ; --j) {
					arr[j] = arr[j-1];
				}
				arr[cur] = val;
			/*	val = arr[cur];
				arr[cur] = arr[i];
				arr[i] = val;
				cur = i;*/
			}
		}
		//if(cur == head) return arr;
		helper(arr, head, cur - 1);
		helper(arr, cur +1, tail);
		return arr;
	}
	
    /**
     * @author yukunlee
     * @Description reverse-linked-list-ii
     * @date 2018年11月16日
     * @param head
     * @param m
     * @param n
     * @return
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pre , last;
        int val =0 ;
        last = pre = head;
        while(n - m > 1) {
            for(int i = 1 ; i < n ; ++i) {
            	if( i == m) pre = last;
            	last = last.next;
            }
            val = pre.val;
            pre.val = last.val;
            last.val = val;
            ++m;
            --n;
        }
    	return head;
    }

}
