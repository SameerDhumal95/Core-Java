package NumberPattern;

public class NumberPattern {
    
	public static void main(String[] args) {

    /*Without Recurssion*/
	int fn = 1;
	int ln = 5;
	for(int i=fn;i<=ln;i++)
	{
		for(int j=fn;j<=i;j++)
		{
			System.out.print(j);
			
		}
		System.out.println();
	}
	
	
	/*With recurssion*/
//	int fn=1;
//	int ln=5;	
//	recur(fn,ln);
    }
	
	static void recur(int fn,int ln)
	{ 
		if(fn<=ln)
		   {
			   for(int i=1; i<=fn; i++)
			   {
				   System.out.print(i);
			   }
			   System.out.println();
			   fn=fn+1;
			   recur(fn,ln);
		   }
		
	}
}
