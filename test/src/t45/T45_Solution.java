package t45;

import t14.TreeNode;

public class T45_Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if(preorder.length == 0) {
    		return null;
    	}
    	return recursion(preorder, inorder, 0,preorder.length-1, 0);
    }
    private TreeNode recursion(int[] preorder, int[] inorder, int head,int tail, int first) {
    	TreeNode root = new TreeNode(preorder[first]);
    	int mid = -1;
    	for(int i = head ; i<= tail; ++i) {  
    		if(inorder[i] == preorder[first]) {
    			mid = i;
    			break;
    		}
    	}
    	if(mid != head) root.left = recursion(preorder, inorder, head,mid-1, first+1);
    	first = first + mid - head;
    	if(mid != tail) root.right = recursion(preorder, inorder, mid+1,tail, first+1);  	
    	return root;
    }

}
