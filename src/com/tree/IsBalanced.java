package com.tree;
//https://leetcode.com/problems/balanced-binary-tree/
public class IsBalanced {
	private int depthChecker(TreeNode root) {
		
		if(root == null) return 0;
		
		int left = depthChecker(root.left);
		int right = depthChecker(root.right);
		if(left == -1 || right == -1)return -1;
		int diff = left-right;
		return diff<=1?Math.max(right, left)+1:-1;	
	}
	public boolean isBalanced(TreeNode root) {
		
		return depthChecker(root)==-1?false:true;
	}
}
