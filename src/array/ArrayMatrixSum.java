package array;

import java.util.Scanner;

public class ArrayMatrixSum {

	public static void main(String[] args) {
		
		int [][] A = new int[2][3];
		int [][] B = new int[2][3];
		int [][] C = new int [2][3];
		
		Scanner input = new Scanner(System.in);
		//getting input for A Matrix;
		System.out.println("Enter your number : ");
		for (int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.printf("A[%d][%d] =",row,col);
				A[row][col]=input.nextInt();
				
				//System.out.println("Enter your number : ");
				
			}
		}
		//getting input for B Matrix;
				System.out.println("Enter your number : ");
				for (int row=0;row<2;row++) {
					for(int col=0;col<3;col++) {
						System.out.printf("A[%d][%d] =",row,col);
						B[row][col]=input.nextInt();
						//System.out.println("Enter your number : ");
						
					}
				}
		
		//printing A Matrix;
		System.out.println("Matrix A :");
		for (int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print("\t" +A[row][col]);
			}System.out.println();
		}
		
		
		
		System.out.println("\n\n");
		//printing B Matrix;
				System.out.println("Matrix B :");
				for (int row=0;row<2;row++) {
					for(int col=0;col<3;col++) {
						System.out.print("\t"+B[row][col]);
					}System.out.println();
				}
				
				
				System.out.println("Matrix A+B :");
				for (int row=0;row<2;row++) {
					for(int col=0;col<3;col++) {
						System.out.print("\t"+(A[row][col]+B[row][col]));
					}System.out.println();
				}

}

}
