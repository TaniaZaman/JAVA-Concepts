 package inheritance;

public class Cat extends Dog { 
	//who acquiring the properties from other class is called child, sub, derived class;
	public void bark() {
		System.out.println("Haloom");//class is not able to multiple inheritance;
	}
	public static void main(String[] args) {
		
		
		Cat obj = new Cat();
	    obj.sound();
	     obj.bark();
	   obj.eat();
	    
	}
}
