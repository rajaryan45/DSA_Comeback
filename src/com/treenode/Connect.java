package com.treenode;

import java.util.LinkedList;
import java.util.Queue;

public class Connect {
	public Node connect(Node root) {
		if(root == null) return root;
		Node headNode = root;
		Queue<Node> queue = new LinkedList<Node>();
		Node prev = root;
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			if(node == null) {
				prev = queue.peek();
				if(!queue.isEmpty()) {
					queue.add(null);
				}
			}else {
				prev.next = node;
				prev = node;
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
					
			}
		}
		return headNode;
	}
}
