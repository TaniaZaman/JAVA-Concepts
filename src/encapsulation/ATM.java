package encapsulation;

public class ATM {

	public static void main(String[] args) {
	 
		
		Bank obj = new Bank();
	 obj.updatePin(123456,1234,2222);
	
 obj.withdrawAmount(123456, 2222, 10000);
		obj.depositCash(123456,2222,10000);

	}

}
