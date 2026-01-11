package com.tree;
//https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
public class SubtreeWithAllDeepest {
	
	private Result dfs(TreeNode node) {
		if(node == null) return new Result(null, 0);
		Result leftNode = dfs(node.left);
		Result rightNode = dfs(node.right);
		if(leftNode.dist > rightNode.dist) return new Result(leftNode.node, leftNode.dist+1);
		if(leftNode.dist < rightNode.dist) return new Result(rightNode.node, rightNode.dist+1);
		
		return new Result(node, leftNode.dist+1);
	}
	
	public TreeNode subtreeWithAllDeepest(TreeNode root) {
		return dfs(root).node;
	}
	
	class Result{
		TreeNode node;
		int dist;
		public Result(TreeNode n, int d) {
			this.node = n;
			this.dist = d;
		}
	}
}
