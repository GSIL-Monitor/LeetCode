package t19;

import java.util.ArrayList;
import java.util.Stack;

import t14.TreeNode;

/**
 * @author yukunlee
 *
 */
public class T19_Solution_2 {
	public ArrayList<Integer> postorderTraversal(TreeNode root){
		
		ArrayList<Integer> arr = new ArrayList<>();
		Stack<TreeNode> s = new Stack<>();
		TreeNode tn = new TreeNode(0);
		if(root == null) {
			return arr;
		}else {
			s.push(root);
		}
		while(s != null ) {
			if(root.left != null && root != tn) {
				s.push(root.left);
				root = root.left;
			}else if(root.right != null ){			 
					s.push(root.right);
					root = root.right;				
			}else {
				tn = s.peek();
				arr.add(s.pop().val);
				root = s.peek();
				if(root.right != null && root.right != tn) {
					s.push(root.right);
					root = root.left;
				}else {
					arr.add(s.pop().val);
					root = s.peek();
				}
			}
		}
		
		
		return arr;
	}


}
