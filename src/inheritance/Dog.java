package inheritance;

public class Dog extends Animal{
	
	public static void main(String[] args) {
		
	
       Dog obj = new Dog();
       obj.sound();
       obj.eat();
}
	
	public void eat() {
		System.out.println("whoa whoa");
	}
}