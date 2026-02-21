package com.heap;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeastInterval {
	public int leastInterval(char[] tasks, int n) {
		int[] map = new int[26];
		for(char x: tasks) {
			map['A'-x]++;
		}
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i = 0 ; i<26;i++) {
			if(map[i] >0)
				maxheap.add(map[i]);
		}
		int time = 0 ;
		Queue<int[]>queue = new LinkedList<int[]>();
		while(!maxheap.isEmpty()||!queue.isEmpty()) {
			time++;

            if (maxheap.isEmpty()) {
                time = queue.peek()[1];
            } else {
                int cnt = maxheap.poll() - 1;
                if (cnt > 0) {
                	queue.add(new int[]{cnt, time + n});
                }
            }

            if (!queue.isEmpty() && queue.peek()[1] == time) {
            	maxheap.add(queue.poll()[0]);
            }
		}
		return time;
	}
}
