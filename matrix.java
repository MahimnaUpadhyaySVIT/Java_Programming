import java.util.*;

class matrix{
	public static void main(String args[]){

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Multiplication of 2x2 matrix");

		int[][] multi_matrix_one=new int[2][2];
		int[][] multi_matrix_two=new int[2][2];

		// Matrix A
		System.out.println("Enter the values of Matrix A: ");
		
		for(int i=0; i<multi_matrix_one.length; i++){
		 for(int j=0; j<multi_matrix_one[i].length; j++){
		     System.out.println("Matrix Values of A: ");
		     multi_matrix_one[i][j]= scn.nextInt();
		   }
		}

	    // Matrix B
	    System.out.println("Enter values of Matrix B: ");

		for(int k=0; k<multi_matrix_two.length; k++){
		 for(int l=0; l<multi_matrix_two[k].length; l++){
		  System.out.println("Matrix Values of B: ");
		  multi_matrix_two[k][l] = scn.nextInt();
		}
	      } 

	    // Multiplication of Matrix A and B
	    int[][] product = new int[multi_matrix_one.length][multi_matrix_two[0].length];

	    for(int m=0; m<multi_matrix_one.length; m++){
	     for(int n=0; n<multi_matrix_two[0].length; n++){
	      for(int o=0; o<multi_matrix_one[0].length; o++){
		  product[m][n] += multi_matrix_one[m][o] * multi_matrix_two[o][n];
	       } 
	      }
	    }

	   // Result of Product
	   for(int p=0; p<product.length; p++){
	     for(int q=0; q<product[p].length; q++){
		System.out.print(product[p][q]+ " ");
	     }
	     System.out.println();
	   }
	
	  scn.close();

	}
}

