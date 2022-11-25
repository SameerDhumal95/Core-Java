package StarPattern;

public class Pattern4 {

public static void main(String[] args) {
		
		int num = 3;
		 for (int i=0; i<num; i++)
	        {
	 
	            for (int j=num-i; j>1; j--)
	            {	              
	                System.out.print(" ");
	            }
	
	            for (int j=1; j<=i; j++ )
	            {	 
	            	
	                System.out.print(j);
	            }
	  	           
	            System.out.println();
	        }
	}
}
