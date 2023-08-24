package constractor;

public class Teacher {  
	
	String name,gender;
	int phone;
	Teacher(){//default constructor
		System.out.println("No Information");
	}
	
	Teacher(String n,String g){//overloading constructor means we can create so many constractor using same name but it has to be different parameter
		name=n;
		gender=g;
	}
	Teacher(String n, String g,int p ){//parameterized constructor
		
		name= n;
		gender=g;
		phone=p;}
		
	
   
	
	
       

	void displayInformation() {
		
		System.out.println("Name :"+name);
		System.out.println("gender :"+gender);
		System.out.println("Phone :"+phone);
		System.out.println("\n");
		
	}
}
