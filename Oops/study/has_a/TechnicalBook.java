package study.has_a;

public class TechnicalBook {

	private String bookName;
	private double cost;
	private MyDate dateOfPublication;
	private String []authers;
	
	TechnicalBook()
	{
		
	}
	
	public TechnicalBook(String bookName, double cost, MyDate dateOfPublication, String []authers)
	{
		this.bookName = bookName;
		this.cost = cost;
		this.dateOfPublication = dateOfPublication;
		this.authers= authers;
	}

	
   @Override
	public boolean equals(Object obj) {  //obj = tb2
		if(obj instanceof TechnicalBook)
		{
			System.out.println("Hello");
			TechnicalBook temp = (TechnicalBook)obj;  //reference created = typecasting 
			
			if(this.bookName.equals(temp.bookName)
			&&
			this.cost == temp.cost
			&&
			this.dateOfPublication.equals(temp.dateOfPublication)
			&&
			compareAuthers(temp.authers))
			
			//***this is the API***
			//Arrays.deepEquals(this.authers, temp.authers))
			    return true;
			else
				return false;
	       	
		}
		else
		return false;
		
	}
   
   private boolean compareAuthers(String[] authers2)
	  {
		  if(this.authers.length == authers2.length)  
		  {
			  for(int i=0;i<this.authers.length;i++)
			  {
				  if( ! this.authers[i].equals(authers2[i]))
					  return false;
			  }
			  return true;
		  }
		  else
			  return false;
	  }
	
   
	@Override
	public String toString() {
		/*String s = bookName+"  "+cost+"  "+getDateOfPublication().getDd()+"/"+getDateOfPublication().getMm()+
				"/"+getDateOfPublication().getYy();*/
		
		String s = bookName+"  "+cost+"  "+ dateOfPublication + " \n";
		
		for(int i=0; i<authers.length; i++)
		{
			s = s + authers[i]+"\t";
			
		}
		return s;
	}
	
	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public MyDate getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(MyDate dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	public String[] getAuthers() {
		return authers;
	}

	public void setAuthers(String[] authers) {
		this.authers = authers;
	}

	
	
	
}
