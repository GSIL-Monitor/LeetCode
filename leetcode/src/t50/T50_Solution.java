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
			if (map.containsKey(ch)) {
				if (map.get(ch) > 0) {
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
		int one = 0, two = A.length - 1;

		for (int i = 0; i <= two; ++i) {
			if (A[i] < 1) {
				A[i] = A[one];
				A[one] = 0;
				++one;
			} else if (A[i] > 1) {
				A[i] = A[two];
				A[two] = 2;
				--two;
				--i;
			}
		}
	}

	/**
	 * @author yukunlee
	 * @Description search-a-2d-matrix
	 * @date 2018年11月27日
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix_v1(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; ++i) {
			if (matrix[i][0] > target) {
				if (i - 1 < 0)
					return false;
				for (int j = 0; j < matrix[0].length; ++j) {
					if (matrix[i - 1][j] == target)
						return true;
				}
				break;
			}
		}
		if (matrix[matrix.length - 1][matrix[0].length - 1] < target) {
			for (int j = 0; j < matrix[0].length; ++j) {
				if (matrix[matrix.length][j] == target)
					return true;
			}
		}
		return false;
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int row = 0, col = matrix[0].length - 1;
		while (row < matrix.length && col >= 0) {
			if (target == matrix[row][col])
				return true;
			else if (target < matrix[row][col]) {
				--col;
			} else if (target > matrix[row][col]) {
				++row;
			}
		}
		return false;
	}

	/**
	 * @author yukunlee
	 * @Description set-matrix-zeroes
	 * @date 2018年11月27日
	 * @param matrix
	 */
	public void setZeroes(int[][] matrix) {
		HashSet<Integer> row = new HashSet<>();
		HashSet<Integer> col = new HashSet<>();

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				if (matrix[i][j] == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}

		for (Integer i : row) {
			for (int j = 0; j < matrix[0].length; ++j) {
				matrix[i][j] = 0;
			}
		}

		for (Integer i : col) {
			for (int j = 0; j < matrix.length; ++j) {
				matrix[j][i] = 0;
			}
		}

	}

	/**
	 * @author yukunlee
	 * @Description edit-distance
	 * @date 2018年11月27日
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance(String word1, String word2) {
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();
		int len1 = s1.length, len2 = s2.length;
		int[][] dp = new int[len1 + 1][len2 + 1];
		for (int i = 0; i <= len1; ++i) {
			for (int j = 0; j <= len2; ++j) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else {
					dp[i][j] = Math.min(Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1),
							dp[i - 1][j - 1] + (s1[i - 1] == s2[j - 1] ? 0 : 1));
				}

			}
		}
		return dp[len1][len2];
	}

	/**
	 * @author yukunlee
	 * @Description simplify-path
	 * @date 2018年11月28日
	 * @param path
	 * @return
	 */
	public String simplifyPath(String path) {
		Stack<String> st = new Stack<>();
		String[] str = path.split("/");
		for (String s : str) {
			if (!st.isEmpty() && s.equals("..")) {
				st.pop();
			} else if (!s.equals("") && !s.equals(".") && !s.equals("..")) {
				st.push(s);
			}
		}
		// List<String> list = new ArrayList<>(st);
		return "/" + String.join("/", st);
	}

	/**
	 * @author yukunlee
	 * @Description climbing-stairs 
	 * @date 2018年11月28日
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < n + 1; ++i) {
			dp[i] = dp[i-1] + dp[i-2]; 
		}
		return dp[n];
	}
	
	
    /**
     * @author yukunlee
     * @Description sqrtx  牛顿逼近法
     * @date 2018年11月28日
     * @param x
     * @return
     */
    public int sqrt(int x) {
    	long n = x , a ,b,c;
        while(n*n > x) {
        	a = (n*n-x);
        	b = (n<<1);
        	c = Math.round((float)a/b);
        	n = n - c;
        	//n = (n+x/n)>>1;
        }
    	return (int)n;
    }
    
    

}
