package String;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str ="MADAM";
		String rstr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rstr = rstr+str.charAt(i);
		}
		
		if(rstr.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}
}
