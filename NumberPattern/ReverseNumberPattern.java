package NumberPattern;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		
//		int fn = 5;
//		int ln = 1;
//		for(int i=fn;i>=ln;i--)
//		{
//			for(int j=fn;j>=i;j--)
//			{
//				System.out.print(j);
//				
//			}
//			System.out.println();
//		}
		
		int fn=1;
		int ln=5;	
		recur(fn,ln);
	    
	}
		
		
	static void recur(int fn,int ln)
	{ 
		if(fn<=ln)
		{
	      for(int i=ln;i>=ln;i--)
	      {
	    	  System.out.println(i);
	      }
	      fn =fn-1;
	      
		}
	}
}
