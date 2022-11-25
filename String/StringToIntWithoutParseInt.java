package String;

public class StringToIntWithoutParseInt {

	public static void main(String[] args) {
		
		String num ="123";
		int num1=0;
		for(int i=0;i<=num.length()-1;i++)
		{
			num1 = num1 * 10 +(int)num.charAt(i)-48;
		}
		System.out.println(num1);
		
		/*Using parseInt*/
		int num2=Integer.parseInt(num);
		System.out.println(num2);
	}

	
}
