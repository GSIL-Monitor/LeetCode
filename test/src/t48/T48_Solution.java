package t48;

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

}
