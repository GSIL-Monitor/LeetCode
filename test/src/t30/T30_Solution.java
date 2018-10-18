package t30;

import java.util.ArrayList;

public class T30_Solution {
    /**
     * @author yukunlee
     * @Description palindrome-partitioning
     * @date 2018年10月18日
     * @param s
     * @return
     */
    public ArrayList<ArrayList<String>> partition(String s) {
    	ArrayList<ArrayList<String>> result = new ArrayList<>();
    	ArrayList<String> midres = new ArrayList<>();
    	return DFS1(s, result, midres);     
    }
    
    private ArrayList<ArrayList<String>> DFS(
    		String s , ArrayList<ArrayList<String>> result , ArrayList<String> midres){
    	int len = s.length();
		for(int i = 1 ; i <= len ;++i) {
			String s1 = s.substring(0,i);
			if(isPalindrome1(s1)) {
				midres.add(s1);
				if(i == len) {
					ArrayList<String> arr = new ArrayList<>(midres);
			    	result.add(arr);   
					if(midres.size() != 0)midres.remove(midres.get(midres.size()-1));
			    	break;
				}
				DFS(s.substring(i), result, midres);
			}	
			if(midres.size() != 0)midres.remove(midres.get(midres.size()-1));
		}
    	return result;   	
    }
    
	private ArrayList<ArrayList<String>> DFS1(String s, ArrayList<ArrayList<String>> result, ArrayList<String> midres) {
		int len = s.length();
		if (len == 0) {
			ArrayList<String> arr = new ArrayList<>(midres);
			result.add(arr);
		}
		for (int i = 1; i <= len; ++i) {
			String s1 = s.substring(0, i);
			if (isPalindrome1(s1)) {
				midres.add(s1);
				DFS1(s.substring(i), result, midres);
				//midres.remove(s1);
				if (midres.size() != 0)midres.remove(midres.size()-1);
			}
		}
		return result;
	}
    
    public boolean isPalindrome(String s) {
    	StringBuffer sb = new StringBuffer(s);
    	String s1 = new String(sb.reverse());
    	if(s.equals(s1)) {return true;}
    	return false;
    }
    
    public boolean isPalindrome1(String s) {
    	int len = s.length();
    	int mid = len/2;
    	for(int i= 0 ; i < mid ; ++i ) {
    		if(s.charAt(i) != s.charAt(len - i - 1)) {
    			return false;
    		}
    	}
    	return true;
    }
}
