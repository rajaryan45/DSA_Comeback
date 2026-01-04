package com.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TopKFrequent {
	public int[] topKFrequent(int[] nums, int k) {
		int[] res = new int[k];
		Map<Integer, Integer> map = new HashMap<>();
		 for(int num: nums) {
			 map.put(num, map.getOrDefault(num, 0) + 1);
	      }
		Map<Integer, Integer> sortedMap =
			    map.entrySet()
			       .stream()
			       .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
			       .collect(
			           LinkedHashMap::new,
			           (m, e) -> m.put(e.getKey(), e.getValue()),
			           Map::putAll
			       );
		int i = 0 ;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(i==k) return res;
			res[i] = entry.getKey();
			i++;
		}
		return res;

	}
}
