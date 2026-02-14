package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		Queue<TreeNode>queue = new LinkedList<TreeNode>();
		
		if(root == null) return res;
		queue.add(root);
		res.add(root.val);
		queue.add(null);
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if(node == null) {
				if(!queue.isEmpty()) {
					res.add(queue.peek().val);
					queue.add(null);
				}
			}else {
				if(node.right != null)queue.add(node.right);
				if(node.left != null)queue.add(node.left);
			}
		}
		
		
		return res;
	}
}
