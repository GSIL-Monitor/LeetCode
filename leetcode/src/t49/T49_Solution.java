package t49;

import java.util.ArrayList;

import t17.ListNode;

public class T49_Solution {
	/**
	 * @author yukunlee
	 * @Description restore-ip-addresses
	 * @date 2018年11月16日
	 * @param s
	 * @return
	 */
	public ArrayList<String> restoreIpAddresses(String s) {
		ArrayList<String> list = new ArrayList<>();
		int val;
		String ip = "";
		int len = s.length();
		for (int i = 1; i <= 3; ++i) {
			for (int j = i + 1; j <= i + 3; ++j) {
				for (int n = j + 1; n <= j + 3; ++n) {
					ip = "";
					if (len <= n || (len - n) > 3)
						continue;

					val = Integer.parseInt(s.substring(0, i));
					if (val < 0 || val > 255)
						continue;
					ip += val + ".";

					val = Integer.parseInt(s.substring(i, j));
					if (val < 0 || val > 255)
						continue;
					ip += val + ".";

					val = Integer.parseInt(s.substring(j, n));
					if (val < 0 || val > 255)
						continue;
					ip += val + ".";

					val = Integer.parseInt(s.substring(n));
					if (val < 0 || val > 255)
						continue;
					ip += val;

					if (ip.length() < len + 3)
						continue;
					list.add(ip);
				}
			}
		}
		return list;
	}

	/**
	 * @author yukunlee
	 * @Description decode-ways
	 * @date 2018年11月19日
	 * @param s
	 * @return
	 */
	public int numDecodings_1(String s) {
		int len = s.length();
		if (len == 0)
			return 0;
		int count = 0;
		int cur, next;
		for (int i = 0; i < len; ++i) {
			cur = Integer.parseInt(s.substring(i, i + 1));
			if (i + 1 < len) {
				next = Integer.parseInt(s.substring(i + 1, i + 2));
			} else {
				next = -1;
			}
			// c = s.charAt(i);
			if ((cur == 1 || (cur == 2 && next > 0 && next < 7)) && next != -1) {
				++count;
			}
			if (cur == 0) {
				--count;
			}
			if (cur == 0 & next == 0) {
				return 0;
			}
			if (cur == 0 && i == 0) {
				return 0;
			}
		}
		return 1 + count;
	}

	public int numDecodings(String s) {
		int len = s.length();
		if (len == 0) {
			return 0;
		}
		int[] dp = new int[len + 1];
		if (Integer.parseInt(s.substring(0, 1)) == 0) {
			return 0;
		} else {
			dp[0] = 1;
			dp[1] = 1;
		}
		char c1, c2;
		for (int i = 2; i <= len; ++i) {
			c1 = s.charAt(i - 1);
			c2 = s.charAt(i - 2);
			if (c1 >= '1' && c2 <= '9') {
				dp[i] += dp[i - 1];
			}
			if (c2 == '1' || c2 == '2' && c1 >= '0' && c1 <= '6') {
				dp[i] += dp[i - 2];
			}
		}

		return dp[len];
	}
	
	/**
	 * @author yukunlee
	 * @Description grayCode
	 * @date 2018年11月19日
	 * @param n
	 * @return
	 */
	public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num = 1 << n;
        for(int i = 0; i < num; ++i){
            arr.add(i>>1^i);  
        }
        return arr;
    }
	
	public ArrayList<Integer> grayCode_v1(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        int bits = 0;
        int len;
        for(int i = 0 ; i < n ; ++i) {
        	bits = 1 << i;
        	len = arr.size();
        	for(int  j = len -1; j >= 0 ; --j) {
        		arr.add(arr.get(j) | bits);
        	}
        }
        return arr;
    }
	
	
    /**
     * @author yukunlee
     * @Description scramble-string
     * @date 2018年11月20日
     * @param s1
     * @param s2
     * @return
     */
    public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2))
        	return true;
        if(s1.length() != s2.length()) 
        	return false;
        int len = s1.length();
        int[] letter = new int[26];
        for(int i = 0 ; i < len ; ++i) {
        	letter[s1.charAt(i) - 'a']++;
        	letter[s2.charAt(i) - 'a']--;
        }
        for(int i = 0 ; i < 26 ; ++i) {
        	if(letter[i] != 0)
        		return false;
        }
        
        for(int i = 1 ; i < len ; ++i) {
        	if(isScramble(s1.substring(0, i), s2.substring(0,i)) 
        			&& isScramble(s1.substring(i), s2.substring(i))) {
        		return true;
        	}
        	if(isScramble(s1.substring(0, i), s2.substring(len - i))
        			&& isScramble(s1.substring(i), s2.substring(0, len - i))) {
        		return true;
        	}
        }
    	return false;
    }
    
    /**
     * @author yukunlee
     * @Description partition-list
     * @date 2018年11月20日
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        
    	return null;
    }

	
		

}
