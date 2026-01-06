package com.matrix;

public class MaxMatrixSum {
	public long maxMatrixSum(int[][] matrix) {
		int negCount = 0 ;
		int min = Integer.MAX_VALUE ; 
		long res = 0 ;
		for(int i = 0 ; i<matrix.length; i++) {
			for(int j = 0 ; j<matrix[i].length;j++) {
				res += (long)Math.abs(matrix[i][j]);
				if(matrix[i][j]<0) negCount++;
				min = Math.min(Math.abs(matrix[i][j]), min);
			}
		}
		if(negCount%2 == 0) {
			return res;
		}else {
			return res-(2*min);
		}
	}
}
