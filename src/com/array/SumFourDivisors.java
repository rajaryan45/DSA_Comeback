package com.array;

import java.util.HashMap;
import java.util.Map;

public class SumFourDivisors {
	private int getDivisorSum(int n) {
		 int count = 0;
	        int sum = 0;

	        for (int i = 1; i * i <= n; i++) {
	            if (n % i == 0) {
	                int d1 = i;
	                int d2 = n / i;

	                if (d1 == d2) {
	                    count++;
	                    sum += d1;
	                } else {
	                    count += 2;
	                    sum += d1 + d2;
	                }

	                if (count > 4) {
	                    return -1;
	                }
	            }
	        }

	        return (count == 4) ? sum : -1;
	}
	public int sumFourDivisors(int[] nums) {
		int sum = 0 ;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			if(map.containsKey(nums[i])){
				sum += map.get(nums[i]); 
			}else {
				int div = getDivisorSum(nums[i]);
				if(div!= -1) {
					sum = sum + div;
					map.put(nums[i], div);
				}
			}
		}
		return sum;
	}
}
