package t49;

import java.util.ArrayList;

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
        String  ip = "";
        int len = s.length();
        for(int i = 1 ; i <= 3 ; ++i) {
        	for(int j = i+1 ; j <= i+3 ; ++j) {
        		for(int n = j+1 ; n <= j+3 ; ++n) {
        			ip = "";
        			if(len <= n ||(len - n) > 3) continue;
        			
        			val = Integer.parseInt(s.substring(0, i));
        			if(val < 0 ||val > 255 ) continue;
        			ip += val + ".";
        			
        			val = Integer.parseInt(s.substring(i , j));
        			if(val < 0 || val > 255 ) continue;
        			ip += val + ".";
        			
        			val = Integer .parseInt(s.substring(j , n));
        			if(val < 0 || val > 255 ) continue;
        			ip += val + ".";
        			
        			val = Integer .parseInt(s.substring(n));
        			if(val < 0 || val > 255 ) continue;
        			ip += val;
        			
        			if(ip.length() < len + 3) continue;
        			list.add(ip);
        		}
        	}
        }
    	return list;
    }

}
