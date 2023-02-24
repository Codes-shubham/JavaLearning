package com.Shubhamjava;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// Here We will create two matrices
		
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int c[][] = new int [3][3];
		//We will create another matrix here to store the multiplication of matrices
        for(int i=0;i<3;i++) {
		    for(int j=0;j<3;j++) {
		     c[i][j]= 0;
		        for(int k=0; k<3; k++)
		        {
		        c[i][j]+=a[i][k]*b[k][j];
		        
		        }
		    }
        } //end of k loop
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
        System.out.print(c[i][j]+" "); //printing matrix
            }
            System.out.println();
            }
	    //end of j loop
       
}
}
