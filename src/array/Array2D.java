package array;

public class Array2D {

	public static void main(String[] args) {   
		
		
		int[][] number= new int[2][3];
		
		
		number[0][0]=10;
		number[0][1]=10;
		number[0][2]=10;
		number[1][0]=10;
		number[1][1]=10;
		number[1][2]=10;
		
		for(int row=0; row<2;row++) {
			for(int col=0; col<3;col++) {
				System.out.println(" "+ number[row][col]);
			}
		}System.out.println(" ");
		
		
	}

}
