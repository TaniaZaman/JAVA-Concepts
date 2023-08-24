package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner Input= new Scanner(System.in);
		
		double[] number = new double [5];
		double sum =0;
		
		
		System.out.print("Please Enter 5 Numbers :");
		for (int i=0; i<5;i++) {
			number[i]= Input.nextDouble();
		}
		for (int i=0; i<5; i++) {
			sum = sum + number[i];
		}
		System.out.println("Numbers Sum is : "+ sum);
		double avg= sum/5;
		System.out.println("Aversge is : "+ avg);
		double max= number[0];
		double min = number[0];
		
		for (int i=0; i<5;i++) {
			if (max<number[i]) {
				max= number[i];
			}
			if (min>number[i]) {
				min= number[i];
			}
		}
			System.out.println("Maximum is : "+ max);
			System.out.println("Minimum is : "+ min);


		
		
		


		
		

	}

}
