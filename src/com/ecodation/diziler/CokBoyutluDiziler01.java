package com.ecodation.diziler;

public class CokBoyutluDiziler01 {

	public static void main(String[] args) {
		
		int[] [] matrix= new int[2][2];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[1][0]=3;
		matrix[1][1]=4;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
