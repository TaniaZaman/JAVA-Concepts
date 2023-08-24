package parameterizedMethod;

public class Teacher { 
	

	String name,gender;
	int phone;
	void setInformation( String n,String m, int p) {
		
		name=n;
		gender=m;
		phone=p;
		 
	}
	
	void displayInformation() {
		
		
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Phone :"+phone);
		System.out.println("\n\n");

	}

}
