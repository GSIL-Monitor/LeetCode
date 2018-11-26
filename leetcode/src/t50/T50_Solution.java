package t50;

import java.util.*;

public class T50_Solution {
	/**
	 * @author yukunlee
	 * @Description minimum-window-substring
	 * @date 2018年11月26日
	 * @param S
	 * @param T
	 * @return
	 */
	public String minWindow(String S, String T) {
		int head = 0, tail = 0, slen = S.length(), tlen = T.length(), count = tlen, d = Integer.MAX_VALUE, start = 0;
		Map<Character, Integer> map = new HashMap<>(30, 0.75f);
		char ch;

		for (int i = 0; i < tlen; ++i) {
			if (map.containsKey(T.charAt(i))) {
				map.put(T.charAt(i), map.get(T.charAt(i)) + 1);
			} else {
				map.put(T.charAt(i), 1);
			}
			// map.put(T.charAt(i),map.containsKey(T.charAt(i))?map.get(T.charAt(i))+1:1);
		}

		/*
		 * for (char c : T.toCharArray()) { if (!map.containsKey(c)) map.put(c, 0);
		 * map.put(c, map.get(c) + 1); }
		 */

		/*
		 * S ="ADOBECODEBANC"; T ="ABC";
		 */
		while (tail < slen) {
			ch = S.charAt(tail++);
			if (map.containsKey(ch) ) {
				if(map.get(ch) > 0) {
					count--;
				}
				map.put(ch, map.get(ch) - 1);
			}
			while (count == 0) {
				if (tail - head < d) {
					d = tail - (start = head);
				}
				ch = S.charAt(head++);
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
					if (map.get(ch) > 0) {
						count++;
					}
				}
			}
		}
		return d == Integer.MAX_VALUE ? "" : S.substring(start, start + d);
	}
	
	
    /**
     * @author yukunlee
     * @Description sort-colors
     * @date 2018年11月26日
     * @param A
     */
    public void sortColors(int[] A) {
        int one = 0 , two = A.length-1;
        
        for(int i = 0 ; i <= two ; ++i) {
        	if(A[i] < 1) {
        		A[i] = A[one];
        		A[one] = 0;
        		++one;
        	}else if(A[i] > 1) {
           		A[i] = A[two];
        		A[two] = 2;
        		--two;
        		--i;
        	}
        }
    }
    
    
}
