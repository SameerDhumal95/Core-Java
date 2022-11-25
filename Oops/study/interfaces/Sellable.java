//package study.interfaces;
//
//public interface Sellable{
//	
//	//by default each method is public or abstract
//	String getProductInfo();
//	
//	public abstract double getProductSellingPrice();
//	
//}
//
////Toy is-a Sellable(
//class Toy implements Sellable,Packable
//{
//
//	private String name;
//	private double cost,discount;
//	
//	public Toy(String name, double cost, double discount)
//	{
//		super();
//		this.name = name;
//		this.cost = cost;
//		this.discount= discount;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getCost() {
//		return cost;
//	}
//
//	public void setCost(double cost) {
//		this.cost = cost;
//	}
//
//	public double getDiscount() {
//		return discount;
//	}
//
//	public void setDiscount(double discount) {
//		this.discount = discount;
//	}
//
//	@Override
//	public String getProductInfo() {
//		
//		return name+" "+cost;
//	}
//
//	@Override
//	public double getProductSellingPrice() {
//		
//		double sp = cost - (discount*cost/100);
//		return 0;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name;
//	}
//
//	@Override
//	public String getPackingDetails() {
//		// TODO Auto-generated method stub
//		return "Card Board Box Packing";
//	}
//} //end of Toy Class
//
////Laptoy is a sellable
//
//class Laptop implements Sellable,Packable
//{
//	String brand,cpu,ramsize,hdsize;
//    double cost,gst;
//	
//
//	public Laptop(String brand, String cpu, String ramsize, String hdsize, double cost, double gst) {
//		super();
//		this.brand = brand;
//		this.cpu = cpu;
//		this.ramsize = ramsize;
//		this.hdsize = hdsize;
//		this.cost = cost;
//		this.gst = gst;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public String getCpu() {
//		return cpu;
//	}
//
//	public void setCpu(String cpu) {
//		this.cpu = cpu;
//	}
//
//	public String getRamsize() {
//		return ramsize;
//	}
//
//	public void setRamsize(String ramsize) {
//		this.ramsize = ramsize;
//	}
//
//	public String getHdsize() {
//		return hdsize;
//	}
//
//	public void setHdsize(String hdsize) {
//		this.hdsize = hdsize;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return brand+"  "+cpu;
//	}
//
//	@Override
//	public String getProductInfo() {
//		// TODO Auto-generated method stub
//		return brand;
//	}
//
//	@Override
//	public double getProductSellingPrice() {
//		double sp =  cost + (cost * gst/100);
//		return sp;
//	}
//
//	@Override
//	public String getPackingDetails() {
//		
//		return "Box packing with cushning bubble plastic";
//	}
//}
//
//
//class Icecream implements Sellable,Packable
//{
//
//	
//	String brand,flavour;
//	int cost;
//	double gst;
//	
//	
//	
//	public Icecream(String brand, String flavour, int cost,double gst) {
//		super();
//		this.brand = brand;
//		this.flavour = flavour;
//		this.cost = cost;
//		this.gst= gst;
//	}
//	
//	
//
//	public String getBrand() {
//		return brand;
//	}
//
//
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//
//
//	public String getFlavour() {
//		return flavour;
//	}
//
//
//
//	public void setFlavour(String flavour) {
//		this.flavour = flavour;
//	}
//
//
//
//	public int getCost() {
//		return cost;
//	}
//
//
//
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//
//
//	@Override
//	public String toString() {
//		
//		return brand+"  "+flavour+"  "+cost;
//	}
//
//	@Override
//	public String getProductInfo() {
//		// TODO Auto-generated method stub
//		return brand;
//	}
//
//	@Override
//	public double getProductSellingPrice() {
//		double sp =  cost + (cost * gst/100);
//		return sp;
//	}
//
//
//
//	@Override
//	public String getPackingDetails() {
//		// TODO Auto-generated method stub
//		return "Pack with Box";
//	}
//	
//}
//
//class Cloths implements Sellable,Packable
//{
//
//	String CType;
//	int cost;
//	double gst;
//	
//	
//	public Cloths(String cType, int cost, double gst) {
//		super();
//		CType = cType;
//		this.cost = cost;
//		this.gst = gst;
//	}
//
//	public String getCType() {
//		return CType;
//	}
//
//	public void setCType(String cType) {
//		CType = cType;
//	}
//
//	public int getCost() {
//		return cost;
//	}
//
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//
//	public double getGst() {
//		return gst;
//	}
//
//	public void setGst(double gst) {
//		this.gst = gst;
//	}
//
//	@Override
//	public String toString() {
//		
//		return CType+"  "+cost+"  "+gst;
//	}
//	@Override
//	public String getProductInfo() {
//		// TODO Auto-generated method stub
//		return CType;
//	}
//
//	@Override
//	public double getProductSellingPrice() {
//		// TODO Auto-generated method stub
//		double sp = cost + (cost*gst/100);
//		return sp;
//	}
//
//	@Override
//	public String getPackingDetails() {
//		// TODO Auto-generated method stub
//		return "Packed with Plastic";
//	}
//	
//}

package study.interfaces;

public interface Sellable {
	
	//by default each method is public abstract
	 String getProductInfo();
	 
	public abstract double getProductSellingPrice();
	 
}

//TOY  is a Sellable 
class Toy implements Sellable,Packable
{
	private String name;
	private double cost,discount ;

		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Toy(String name, double cost, double discount) {
		super();
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	@Override
	public String getProductInfo() {
		
		return name+" "+cost;
	}

	@Override
	public double getProductSellingPrice() {
		double sp = cost -  (discount *cost/100);
		return sp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getPackingDetails() {
		
		return "card board box packing";
	}
	
}//end of toy class


//Laptop is a Sellable 
class Laptop  implements Sellable , Packable
{
	String brand,cpu,ramsize,hdsize;
	double cost,gst;
	

	public Laptop(String brand, String cpu, String ramsize, String hdsize, double cost, double gst) {
		super();
		this.brand = brand;
		this.cpu = cpu;
		this.ramsize = ramsize;
		this.hdsize = hdsize;
		this.cost = cost;
		this.gst = gst;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}

	public String getHdsize() {
		return hdsize;
	}

	public void setHdsize(String hdsize) {
		this.hdsize = hdsize;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return brand +"  "+cpu;
	}

	@Override
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return brand +"  "+cost;
	}

	@Override
	public double getProductSellingPrice() {
		double sp = cost +  (cost*gst/100);
		return sp;
	}

	@Override
	public String getPackingDetails() {
		// TODO Auto-generated method stub
		return "Pack with cushioning bubble plastic in a cardboard box";
	}
}













