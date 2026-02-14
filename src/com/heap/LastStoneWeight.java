package com.heap;

import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(
				(a,b)->Integer.compare(b,a)
		);
		
		for(int x : stones) {
			heap.add(x);
		}
		while(heap.size()>1) {
			int x = heap.poll();
			int y = heap.poll();
			if(x == y ) {
				continue;
			}
			if(x!=y) {
				heap.add(Math.abs(y-x));
			}
		}
		return heap.size()==1?heap.poll():0;
	}
}
