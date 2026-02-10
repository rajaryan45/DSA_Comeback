package com.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximizeSquareArea {
	public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
		List<Integer> hList = new ArrayList<>();
        List<Integer> vList = new ArrayList<>();

        for (int x : hFences) hList.add(x);
        for (int x : vFences) vList.add(x);

        // add boundaries
        hList.add(1);
        hList.add(m);
        vList.add(1);
        vList.add(n);

        Collections.sort(hList);
        Collections.sort(vList);

        Set<Integer> widths = new HashSet<>();

        // all vertical widths
        for (int i = 0; i < vList.size(); i++) {
            for (int j = i + 1; j < vList.size(); j++) {
                widths.add(vList.get(j) - vList.get(i));
            }
        }

        int maxSide = 0;

        // check horizontal heights
        for (int i = 0; i < hList.size(); i++) {
            for (int j = i + 1; j < hList.size(); j++) {
                int height = hList.get(j) - hList.get(i);
                if (widths.contains(height)) {
                    maxSide = Math.max(maxSide, height);
                }
            }
        }

        if (maxSide == 0) 
            return -1;

        long area = (long) maxSide * maxSide;
        return (int) (area % 1_000_000_007);
	}
}
