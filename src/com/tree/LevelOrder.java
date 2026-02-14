package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Queue<TreeNode>queue = new LinkedList<TreeNode>();
		if(root == null) return res;
		queue.add(root);
		queue.add(null);
		List<Integer>leveList = new ArrayList<Integer>();
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if(node==null) {
				res.add(leveList);
				leveList = new ArrayList<Integer>();
				if(!queue.isEmpty()) {
					queue.add(null);
				}
			}else {
				leveList.add(node.val);
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
			}
		}
		return res;
	}
}
