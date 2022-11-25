package String;

public class ReverseSentense {

	public static void main(String[] args) {
		String[] str="Hello World".split(" ");
		String rstr="";
		for(int i=str.length-1;i>=0;i--)
		{
		  rstr = rstr + str[i]+" ";
		}
		System.out.println(rstr);
	}
}
