package String;

public class ReverseWordString
{
  public static void main(String args[])
   { 
     String str = "I love India";
     String[] sstr = str.split(" ");
     String rstr = "";
     String rrstr="";
     for(int i=0;i<=sstr.length-1;i++)
     {
    	 rstr = sstr[i];
    	 for(int j=rstr.length()-1;j>=0;j--)
    	 {
    		 rrstr= rrstr + rstr.charAt(j);
    		 
    	 }
    	 rrstr = rrstr + " ";
    	 
     }
     System.out.println(rrstr);
   }
}
