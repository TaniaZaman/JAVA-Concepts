package overload;

public class TestOverloadedMethod {

	public static void main(String[] args) {

		OverloadedMethod obj = new OverloadedMethod();
		
		obj.add();
		obj.add(2,3);
		obj.add(2.4,3.6 );
		obj.add(2,4,3 );
		

	}

}
