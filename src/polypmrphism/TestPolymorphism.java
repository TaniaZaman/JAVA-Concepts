package polypmrphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		
		
	Shape s = new Shape ();
	Shape s1 =new Rectangular(10,20);
	Shape s2 = new Triangle (5,20);
	
	System.out.println(s.area());
	System.out.println(s1.area());
	System.out.println(s2.area());
	

	}

}
