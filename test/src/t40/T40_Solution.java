package t40;

import java.util.LinkedList;
import java.util.Queue;

public class T40_Solution {
	/**
	 * @author yukunlee
	 * @Description populating-next-right-pointers-in-each-node
	 * @date 2018年10月30日
	 * @param root
	 */
	public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
		Queue<TreeLinkNode> queue = new LinkedList<>();
		TreeLinkNode n = new TreeLinkNode(0);
		int layer = 0;
		queue.offer(root);

		while (!queue.isEmpty()) {
			layer = queue.size();
			while (layer > 0) {
				n = queue.poll();
				n.next = layer > 1 ? queue.peek() : null;
				if (n.left != null) {
					queue.offer(n.left);
				}
				if (n.right != null) {
					queue.offer(n.right);
				}
				--layer;
			}
		}

	}

}
