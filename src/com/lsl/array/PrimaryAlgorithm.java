package com.lsl.array;


public class PrimaryAlgorithm {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * [".",".",".",".","5",".",".","1","."],
		 * [".","4",".","3",".",".",".",".","."],
		 * [".",".",".",".",".","3",".",".","1"],
		 * ["8",".",".",".",".",".",".","2","."],
		 * [".",".","2",".","7",".",".",".","."],
		 * [".","1","5",".",".",".",".",".","."],
		 * [".",".",".",".",".","2",".",".","."],
		 * [".","2",".","9",".",".",".",".","."],
		 * [".",".","4",".",".",".",".",".","."]
		 */
		int[] nums = new int[] {2, 7, 11, 15,7};
		System.out.println(twoSum(nums,9)[0] + " : " + twoSum(nums,9)[1]);
		char[][] board = new char[][] {
			{'.','.','.','.','.','.','.','.','5'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','5'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'}
		};
		System.out.println(isValidSudoku(board));
		
	}
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * Example:
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * Because nums[0] + nums[1] = 2 + 7 = 9,
	 * return [0, 1].
	 * @param args
	 */
	public static int[] twoSum(int[] nums, int target) {
		//int[] result = new int[nums.length] ;
		int x = 0;
		int y = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if(i != j && nums[i] + nums[j] == target){
					x = i;
					y = j;
					break;
				}
			}
		}
		return new int[] {x,y};
    }
	/**
	 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
	 * Each row must contain the digits 1-9 without repetition.
	 * Each column must contain the digits 1-9 without repetition.
	 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
	 * @param board
	 * @return
	 */
	public static boolean isValidSudoku(char[][] board) {
		boolean b = true;
		for (int i = 0; i < board.length ; i++) {
			for (int k = 0; k < board.length; k++) {
				for (int j = 0; j < board.length ; j++) {
					if(board[i][k] != '.' 
						&& board[i][j] != '.' 
						&& board[i][k] == board[i][j] 
						&& k != j) {
						b = false;
						break;
					}
					if(!b)
						break;
					if(board[i][k] != '.' 
						&& board[j][k] != '.' 
						&& board[i][k] == board[j][k] 
						&& i != j) {
						b = false;
						break;
					}
					if(!b)
						break;
				}
				if(!b)
					break;
				if(i % 3 == 1 && k % 3 == 1) {
					for (int j = i - 1; j < i + 2; j++) {
						for (int x = k - 1; x < k + 2; x++) {
							for (int n = i - 1; n < i + 2; n++) {
								for (int y = k - 1; y < k + 2; y++) {
									if(board[j][x] != '.'
										&& board[n][y] != '.'
										&& board[j][x] == board[n][y] 
										) {
										if(j == n){
											if(x == y) {
												continue;
											}
										}
										b = false;
										break;
									}
								}
								if(!b)
									break;
							}
							if(!b)
								break;
						}
						if(!b)
							break;
					}
				}
				if(!b)
					break;
			}
			if(!b)
				break;
		}
        return b;
    }
}

