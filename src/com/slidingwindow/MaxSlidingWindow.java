package com.slidingwindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class MaxSlidingWindow {
	private int max(int[] nums, int l, int r) {
		int max = -10001;
		for(;l<=r;l++) {
			max = max>nums[l]?max:nums[l];
		}
		return max;
	}
	public int[] maxSlidingWindow1(int[] nums, int k) {
		List<Integer> res = new ArrayList<Integer>();
		int l = 0 , r =0;
		for(;r<nums.length;r++) {
			while((r-l+1) > k) {
				l++;
			}
			if((r-l+1)==k) {
				res.add(max(nums, l, r));
			}
		}
		
		return res.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public int[] maxSlidingWindow2(int[] nums, int k) {
		PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a,b)->b[0]-a[0]);
		int[] output = new int[nums.length - k + 1];
        int idx = 0;
		for(int i = 0 ; i<nums.length;i++) {
			heap.offer(new int[] {nums[i],i});
			if(i>=k-1) {
				while(heap.peek()[1] <= i-k) {
					heap.poll();
				}
				output[idx++] = heap.peek()[0];
			}
		}
		return output;
	}
	
	public int[] maxSlidingWindow(int[] nums, int k) {
		Deque<Integer> deque = new LinkedList<Integer>();
		int l = 0, r = 0;
		int[] output = new int[nums.length-k+1];
		for(;r<nums.length;r++) {
			while(!deque.isEmpty() && nums[deque.getLast()] < nums[r]) {
				deque.removeLast();
			}
			deque.addLast(r);
			
			if(l>deque.getFirst()) deque.removeFirst();
			
			if(r>=k-1) {
				output[l] = nums[deque.getFirst()];
				l++;
			}
			
		}
		return output;
	}
}
