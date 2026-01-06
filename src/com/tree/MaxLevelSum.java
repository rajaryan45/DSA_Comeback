package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
	public int maxLevelSum1(TreeNode root) {
		if(root == null)return 0;
		if(root.left == null && root.right == null) return root.val;
		
		int maxSum = -100001;
		int levelSum = 0 ;
		int level = 0, currLevel = 1;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		queue.offer(null);
		maxSum = maxSum>root.val?maxSum:root.val;
		while(!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			if(tempNode == null) {
				if(levelSum>maxSum) {
					maxSum = levelSum;
					level = currLevel;
				}
				if(!queue.isEmpty()) {
					queue.offer(null);
					currLevel ++;
				}
				levelSum = 0;
			}else {
				levelSum = levelSum+tempNode.val;
				if(tempNode.left != null)queue.offer(tempNode.left);
				if(tempNode.right != null)queue.offer(tempNode.right);
			}
			
		}
		
		
		return level;
	}
	int maxLevel=0;
    
	void dfs(TreeNode root,int currLevel,int[]  sum){
        if(root==null){
            return;
        }
        sum[currLevel]+=root.val;
        maxLevel=Math.max(maxLevel,currLevel);
        dfs(root.left,currLevel+1,sum);
        dfs(root.right,currLevel+1,sum);
    }
	public int maxLevelSum(TreeNode root) {
		   int level=0;
	        int sum[] = new int[10000];
	 
	        dfs(root,0,sum);
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<=maxLevel;i++){
	            if(sum[i]>max){
	                max=sum[i];
	                level=i;
	            }
	        }
	        return level+1;
	}
}

