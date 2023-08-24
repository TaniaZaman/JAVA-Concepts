package array;

public class Array1 {

	public static void main(String[] args) {
		int[] ids = new int[5];
		
		ids[0] =10;
		ids[1] =10;
		ids[2] =10;
		ids[3] =10;
		ids[4] =10;
		
		int len= ids.length;
		
		int sum = ids[0]+ids[1]+ids[2]+ids[3]+ids[4];
		System.out.println("ids Sum is : "+ sum);
		System.out.println("Array size is :" +len);

	}

}
