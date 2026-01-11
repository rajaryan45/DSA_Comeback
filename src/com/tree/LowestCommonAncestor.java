package com.tree;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
public class LowestCommonAncestor {
	TreeNode lcaNode = null;
	private int[] dfs(TreeNode node, TreeNode p, TreeNode q) {
		int[] res = {0,0};
		if(node ==null) return res;
		
		
		int[] leftres = dfs(node.left, p, q);
		int[] rightres = dfs(node.right, p, q);
		res[0] = leftres[0] | rightres[0];
		res[1] = leftres[1] | rightres[1];
		
		
		
		if(res[0] == 1 && res[1] == 1 && lcaNode == null) {
			lcaNode = node;
			return res;
		}
		if(res[0] == 1 && res[1] == 1 && lcaNode != null) {
			return res;
		}
		
		if(p == node) res[0] = 1;
		if(q == node) res[1] = 1;
		
		if((node ==p && res[1] == 1) || (node == q && res[0] == 1)) {
			lcaNode = node;
			return res;
		}
			
		return res;
		
		
	}
	
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int[] res = {-1,-1};
		dfs(root, p, q);
		return lcaNode;
	}
	
	
}
