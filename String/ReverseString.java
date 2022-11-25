package String;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";
		String rstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rstr = rstr + str.charAt(i);
			
		}
		System.out.println(rstr);
	}
}
