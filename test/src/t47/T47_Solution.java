package t47;

public class T47_Solution {
    /**
     * @author yukunlee
     * @Description interleaving-string
     * @date 2018年11月11日
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public boolean isInterleave_v1(String s1, String s2, String s3) {
    	int len = s3.length();
    	String  n = "";
        for(int i = 0 ; i < len ;++i) {
        	n = s3.substring(0, 1);
        	if(s1.length() > 0&&n.equals(s1.substring(0, 1))) {
        		s1 = s1.substring(1);
        		s3 = s3.substring(1);
        		continue;
        	}
        	if(s2.length() >0 &&n.equals(s2.substring(0, 1))) {
        		s2 = s2.substring(1);
        		s3 = s3.substring(1);
        		continue;
        	}
        	return false;
        }
        return s1.length() ==0 &&s2.length() ==0 ? true : false;
    }
    
    public boolean isInterleave_v2(String s1, String s2, String s3) {
    	int len1 = s1.length();
    	int len2 = s2.length();
    	if(len1 + len2 != s3.length()) {
    		return false;
    	}
    	
    	int pre = 0;
    	int cur =0;
    	for(int i = 0 ; i < len1 ; ++i) {
    		cur = s3.lastIndexOf(s1.charAt(i));
    		if(cur == -1 || cur < pre) {
    			return false;
    		}
    		pre = s3.indexOf(s1.charAt(i));
    	}
    	
    	for(int i = 0 ; i< len2 ; ++i) {
    		cur = s3.lastIndexOf(s2.charAt(i));
    		if(cur == -1 || cur < pre) {
    			return false;
    		}
    		pre = s3.indexOf(s2.charAt(i));

    	}
    	
    	return true;
    }

}
