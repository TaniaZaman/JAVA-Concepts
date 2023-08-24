package constractor;

public class Test {

	public static void main(String[] args) {
	  Teacher teacher = new Teacher();//default constractor
		
		Teacher teacher2 = new Teacher("Tanim Sultan","male");//parameterized constractor
		Teacher teacher1 = new Teacher("Tania Sultana","female", 2345555);
		
		
		//teacher.displayInformation();
		teacher1.displayInformation();
		teacher2.displayInformation();
		//difference between constractor and method
		//constructor is used to initialize the state of an object/Method expose behaviour of an object.
		//constractor must be the same name of the  class name /Method name should not be same name of class name;
		//constructor must not return type /Method must have return type 
		//constructor invoked implicity/Method invoked explicity

	}

}
