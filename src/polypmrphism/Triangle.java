package polypmrphism;

public class Triangle extends Shape {
	
	double base,highth;
	
	
	
	Triangle(double base, double highth){
		this.base =base;
		this.highth = highth;
	}
	
	double area() {
		System.out.print("Area for Triangle :");
		return 0.5*base*highth;
		
	}

}
