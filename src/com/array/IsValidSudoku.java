package com.array;

import java.util.Arrays;


//https://leetcode.com/problems/valid-sudoku/
public class IsValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		StringBuilder[] row = new StringBuilder[9];
		for (int i = 0; i < 9; i++) {
		    row[i] = new StringBuilder("0000000000");
		}

		StringBuilder[] col = new StringBuilder[9];
		for (int i = 0; i < 9; i++) {
		    col[i] = new StringBuilder("0000000000");
		}
		
		StringBuilder[] grid = new StringBuilder[9];
		for (int i = 0; i < 9; i++) {
		    grid[i] = new StringBuilder("0000000000");
		}
		
		for(int i = 0 ; i<board.length;i++) {
			for(int j = 0 ; j<board[i].length;j++) {
				int grd = (i / 3) * 3 + (j / 3);
				int brd = Character.getNumericValue(board[i][j]);
				if(brd == -1) continue;
				System.out.println(brd);
				if(row[i].charAt(brd) == '1' || col[j].charAt(brd) == '1' ||grid[grd].charAt(brd) =='1' ){
					return false;
				}else {
					if(row[i].charAt(brd) == '0') {
						row[i].setCharAt(brd, '1');
					}
					if(col[j].charAt(brd) == '0') {
						col[j].setCharAt(brd, '1');
					}
					if(grid[grd].charAt(brd) == '0') {
						grid[grd].setCharAt(brd, '1');
					}
					
			}
		}
	}
		return true;
	}
}
