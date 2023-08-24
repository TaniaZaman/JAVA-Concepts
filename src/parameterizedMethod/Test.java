package parameterizedMethod;

public class Test {

	public static void main(String[] args) {
		
		
		Teacher teacher1 = new Teacher();  
		teacher1.setInformation("Tania Sultana", "female", 7327261);
		teacher1.displayInformation();  
		
		
		
		Teacher teacher2 = new Teacher();
		teacher2.setInformation("Md Sharifuzzaman", "male", 7327262); 
		teacher2.displayInformation();
	}

}
