package com.tree;

import java.util.Stack;

public class MaxProduct {
	private int maxSum = 0;
	final long MOD = 1_000_000_007;
	private int dfs(TreeNode node,int totalSum) {
		if(node==null) return 0;
		int left = dfs(node.left,totalSum);
		int right = dfs(node.right,totalSum);
		int nodeSum = (left+right+node.val);
		maxSum = Math.max((totalSum-nodeSum)*nodeSum, maxSum);
		return nodeSum;
	}
	
	public int maxProduct(TreeNode root) {
		int totalSum = 0;
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		

		while (!st.isEmpty()) {
		    TreeNode cur = st.pop();
		    totalSum = (totalSum+ cur.val);

		    if (cur.right != null) st.push(cur.right);
		    if (cur.left != null) st.push(cur.left);
		}
		
		int sum = dfs(root, totalSum);
//		maxSum = Math.max(maxSum, sum);
		
       return (int) (maxSum % MOD);
    }
}
