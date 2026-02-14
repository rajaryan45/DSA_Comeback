package com.tree;
//https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBinaryTree {
	private int max = 0;
	private int maxDepth(TreeNode root) {
		if(root == null)return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		max = (left+right)>max?(left+right):max;
		
		return (Math.max(left, right)+1);
		
	}
	public int diameterOfBinaryTree(TreeNode root) {
		maxDepth(root);
		
		return max;
	}
}
