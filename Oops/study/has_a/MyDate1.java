package study.has_a;


//comparable 
public class MyDate1 implements Comparable<MyDate1> {
	
	private int dd;
	private int mm;
	private int yy;
	
//unimplimented method	
	public int compareTo(MyDate1 o)
	{
		if(this.yy > o.yy)  return 1;
		if(this.yy < o.yy)  return -1;
		else {
			if(this.mm > o.mm)  return 1;
			if(this.mm < o.mm)  return -1;
			else
			{
				if(this.dd > o.dd) return 1;
				if(this.dd < o.dd)  return -1;
				else 
					return 0;
			}
			
		}
		
	}
	public MyDate1()
	{
		
	}
	public MyDate1(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof MyDate1)
		{
			MyDate1 temp = (MyDate1)obj;
			
			if(this.dd == temp.dd && this.yy == temp.yy && this.mm == temp.mm)
				return true;
			else
				return false;
		}
		else 
			return false;
	}
	
   @Override  //this is the object toString  will print MyDate
    public String toString() {
	   
	String s = dd+"/"+mm+"/"+yy;
	   
	return s;
    }
   
   
   
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	
}
