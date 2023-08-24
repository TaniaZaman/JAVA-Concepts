package staticVariable;

public class StaticVariable {
	
	String name;
	int id;
	static String UniversityName="LU";
	
	StaticVariable(String n, int i){
		name=n;
		id=i;}
		
		void displayInformation() {
			
			System.out.println("Name :"+name);
			System.out.println("id :"+id);
			System.out.println("Name :"+StaticVariable.UniversityName);
			
		
	}

}
