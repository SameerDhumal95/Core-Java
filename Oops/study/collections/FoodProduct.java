package study.collections;
import java.util.Comparator;


import study.has_a.MyDate1;

public class FoodProduct implements Comparable<FoodProduct>{

	private String Name,brand;
	private MyDate1 expiryDate;
	private int cost,calories;
	private String desc;
	private double fatper,proteinper,carbperc;


	public FoodProduct(String name, String brand, MyDate1 expiryDate, int cost, int calories, String desc,
			double fatper, double proteinper, double carbperc) {
		super();
		Name = name;
		this.brand = brand;
		this.expiryDate = expiryDate;
		this.cost = cost;
		this.calories = calories;
		this.desc = desc;
		this.fatper = fatper;
		this.proteinper = proteinper;
		this.carbperc = carbperc;
	}

	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public MyDate1 getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(MyDate1 expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getFatper() {
		return fatper;
	}

	public void setFatper(double fatper) {
		this.fatper = fatper;
	}

	public double getProteinper() {
		return proteinper;
	}

	public void setProteinper(double proteinper) {
		this.proteinper = proteinper;
	}

	public double getCarbperc() {
		return carbperc;
	}

	public void setCarbperc(double carbperc) {
		this.carbperc = carbperc;
	}

	@Override
	public String toString() {
		String str = "FoodProduct: \nName = " + Name + "\nBrand = " + brand + "\nExpiry Date = " + expiryDate + "\ncost = " + cost
				+ "\nCalories = " + calories + "\nDescription = " + desc + "\nFat Percentage = " + fatper +"%"+"\nProtin Percentage = " + proteinper+"%"
				+ "\nCarb Percentage = " + carbperc +"%\n\n";
		return str;
	}


	@Override
	public int compareTo(FoodProduct o) {
		
		return this.expiryDate.compareTo(o.expiryDate); //default ordering 
	}

	
}

//comparator interface method override
class FatComparator implements Comparator<FoodProduct> 
{

	@Override
	public int compare(FoodProduct o1, FoodProduct o2) {
		if(o1.getFatper() > o2.getFatper()) return 1;
		if(o1.getFatper() < o2.getFatper()) return -1;
		else return 0;
	}
	
}

class ProtienComparator implements Comparator<FoodProduct>
{

	@Override
	public int compare(FoodProduct o1, FoodProduct o2) {
		
		if(o1.getProteinper() > o2.getProteinper())  return 1;
		if(o1.getProteinper() < o2.getProteinper())  return -1;
		else return 0;
	}
	
	
}
