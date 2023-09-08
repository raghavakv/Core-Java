package com.arrays.one;

public class JaggedArrays {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[5];
		arr[2] = new int[3];
	
		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[1][2] = 3;
		arr[1][3] = 4;
		arr[1][4] = 3;
		
		arr[2][0] = 5;
		arr[2][1] = 6;
		arr[2][2] = 3;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
