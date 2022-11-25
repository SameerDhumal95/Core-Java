package study.has_a;

public class MyDate {

	private int dd;
	private int mm;
	private int yy;
	
	public MyDate()
	{
		
	}
	public MyDate(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof MyDate)
		{
			MyDate temp = (MyDate)obj;
			
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
