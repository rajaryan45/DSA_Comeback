package com.heap;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest {
	public int[][] kClosest(int[][] points, int k) {
		
		PriorityQueue<int[]> heap =new PriorityQueue<int[]>(
				(a,b)->{
					int dista = (a[0]*a[0]) + (a[1]*a[1]);
					int distb = (b[0]*b[0]) + (b[1]*b[1]);
					return Integer.compare(dista, distb);
				}
				);
		for(int[] point : points) {
			heap.add(point);
		}
		
		int[][] res = new int[k][2];
		while(k>0) {
			int[] point = heap.poll();
			res[k-1][0] = point[0];
			res[k-1][1] = point[1];
			k--;
		}
		
		
		return res;
	}
}
