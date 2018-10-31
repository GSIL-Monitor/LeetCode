package t42;

import t14.TreeNode;

public class T42_Solution {
	/**
	 * @author yukunlee
	 * @Description path-sum
	 * @date 2018年10月31日
	 * @param root
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		return root == null ? false : recursion(root, sum, 0);
	}

	private boolean recursion(TreeNode root, int sum, int count) {
		if (root == null) {
			return  false;
		}
		if(root.left == null && root.right == null) {
			count += root.val;
			return sum == count ? true : false;
		}
		count += root.val;
		return recursion(root.left, sum, count) || recursion(root.right, sum, count);

	}

}
