package String;

public class IntToStringWithoutParseInt {

	public static void main(String[] args) {
	
		int num=123;
		//String str = String.valueOf(num);
		//String str = Integer.toString(num);
		StringBuffer sb = new StringBuffer();
		sb.append(num);
		String str = sb.toString();
		System.out.println(str);
		

}
}
