package t43;

import t14.TreeNode;

public class T43_Solution {
    /**
     * @author yukunlee
     * @Description balanced-binary-tree
     * @date 2018年11月1日
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(treeHight(root.left) - treeHight(root.right)) > 1) return false;
    	return isBalanced(root.left)&&isBalanced(root.right);
    }
    private int treeHight(TreeNode root) {
    	return root == null? 1:Math.max(treeHight(root.left), treeHight(root.right))+1;
    }

}
