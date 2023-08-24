package datatype;
import java.util.Scanner;
public class InputType {  
	
	public static void main(String[] args) {
		
		//How to get user input
//		need to Scanner class
//		and following method 
		
		Scanner input = new Scanner(System.in);
		/*int num;
		System.out.print("Enter your number :");
		num= input.nextInt();
		System.out.println("Number :"+ num);*/
		String name;
		System.out.print("Enter your name :");
		name= input.nextLine();
		System.out.println("Name :"+ name);
		
		
		
		
	}

}
