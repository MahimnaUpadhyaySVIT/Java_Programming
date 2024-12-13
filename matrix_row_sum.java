/* Write a java program to create a class “Matrix” that would contain integer values having
 varied Numbers of columns for each row. Print row-wise sum of the integer values for
 eachrow. */

import java.util.*;

class matrix_row_sum{
	public static void main(String[] args){
		
		int sum;

		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the no. of rows: ");
		int rows = scn.nextInt();

		System.out.print("Enter the no. of columns: ");
		int columns = scn.nextInt();

		int[][] Two_D_Array = new int[rows][columns];

		System.out.println("Enter values for a matrix: ");
		for(int i=0; i<Two_D_Array.length; i++){
			for(int j=0; j<Two_D_Array[i].length; j++){
				Two_D_Array[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("Matrix before sums of rows: ");
		for(int i=0; i<Two_D_Array.length; i++){
			for(int j=0; j<Two_D_Array[i].length; j++){
				System.out.print(Two_D_Array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Matrix after sums of rows: ");
		for(int i=0; i<Two_D_Array.length; i++){
			sum = 0;
			for(int j=0; j<Two_D_Array[i].length; j++){
				sum += Two_D_Array[i][j];
			}
			System.out.print(sum + " ");
		}
		System.out.println();


		
	}
}
