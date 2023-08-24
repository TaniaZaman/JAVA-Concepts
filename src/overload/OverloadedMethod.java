package overload;

public class OverloadedMethod {
	
	void add(int i ,int j) {
		System.out.println(i+j);
	}
//overload Method is a special method where a class have 
//	two or more method as same name but parameter is different.
	void add(double i ,double j) {
		System.out.println(i+j);
	}
	
	
	
	void add(int i ,int j, int k) {
		System.out.println(i+j+k);
	}
	void add() {
		System.out.println("Nothing to add");
	}

}
