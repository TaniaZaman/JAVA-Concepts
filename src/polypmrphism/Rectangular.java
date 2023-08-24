package polypmrphism;

public class Rectangular extends Shape{

	
	double length,width;
	
	Rectangular(double length,double width){
		this.length = length;
		this.width = width;
	}
	
	 double area() {
		 System.out.print("Area for Rectangular :");
		return length*width;
	}
}
