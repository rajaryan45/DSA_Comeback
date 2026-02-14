package com.tree;

public class InvertTree {
	
	private void treeOp(TreeNode root) {
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if(root.left != null)
			treeOp(root.left);
		if(root.right != null)
			treeOp(root.right);
		
		return;
	}
	
	public TreeNode invertTree(TreeNode root) {
		
		treeOp(root);
		
		return root;
	}
}
