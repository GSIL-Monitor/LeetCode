package t46;

import java.util.ArrayList;

import t14.TreeNode;

public class T46_Solution {
    /**
     * @author yukunlee
     * @Description maximum-depth-of-binary-tree
     * @date 2018年11月3日
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    
    /**
     * @author yukunlee
     * @Description binary-tree-zigzag-level-order-traversal
     * @date 2018年11月3日
     * @param root
     * @return
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        
    	return null;
    }

}
