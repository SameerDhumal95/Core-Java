package study.has_a;

public class Bank {
	private static int balAmt=0;

	public static int deposit(int amt) {
		balAmt=balAmt+amt;
		
		return amt;
	}
	
	public static int withdraw(int amt) {
		int withdraw=balAmt-amt;
		if(withdraw>100) {
			balAmt=balAmt-amt;
			return amt;
		}
		else
		{ return -1;}
	}
	
	public static void showBalance() {
		System.out.println("Your Balance Amount is : $"+balAmt);
	}
}
