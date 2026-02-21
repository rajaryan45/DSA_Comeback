package com.heap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindLeastNumOfUniqueInts {
	public int findLeastNumOfUniqueInts(int[] arr, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		
		for(int x : arr) {
			hmap.put(x, hmap.getOrDefault(x, 0)+1);
		}
		pqueue.addAll(hmap.values());
		
		while(k>0) {
			int top = pqueue.poll();
			if(top<=k) {
				k -= top;
			}else {
				pqueue.add(top- k);
				k = 0;
			}
		}
		return pqueue.size();
	}
}
