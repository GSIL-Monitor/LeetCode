package t48;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import t49.T49_Solution;

public class T48_test {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		T48_Solution s = new T48_Solution();
		//int[] arr = {3,2,4,5,1};
		int[] arr = {3,2,4,5,1,2,6,1,2,5,2,9,0,1,5,1};

		s.Solution(arr);
		for(int i : arr) {
			System.out.print(i);
		}*/
		String s = "";
		int a = 1;
		s += a;
		System.out.println(s);
		
		T49_Solution t = new T49_Solution();
		ArrayList<String> list = t.restoreIpAddresses("010010");
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json);
		

	}

}
