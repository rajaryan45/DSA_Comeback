package com.tree;

public class InsertIntoBST {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		boolean flag = false;
		TreeNode resNode = root;
		TreeNode node = null;
		if(root ==null) return new TreeNode(val);
		while(root!= null) {
			node = root;
			if(val <= root.val) {
				root = root.left;
			}else {
				root = root.right;
			}
		}
		if(val <= node.val) {
			node.left = new TreeNode(val);
		}else {
			node.right = new TreeNode(val);
		}
		return resNode;
	}
}
