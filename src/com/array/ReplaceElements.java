package com.array;

public class ReplaceElements {
	public int[] replaceElements(int[] arr) {
		int max = -1;
		int temp = arr[arr.length-1];
		for(int i = arr.length-1 ; i>= 0 ; i--) {
			temp = arr[i];
			arr[i] = max;
			if(temp>max) max = temp;
		}
		return arr;
	}
}
