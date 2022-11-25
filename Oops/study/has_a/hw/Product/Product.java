package study.has_a.hw.Product;

import study.has_a.MyDate;

public class Product {

	String name;
	String desc;
    double unitCost;
    MyDate expiryDate;
    
    Product()
    {}
    
    Product(String name,String desc,double unitCost,MyDate expiryDate)
    {
    	this.name= name;
    	this.desc= desc;
    	this.unitCost= unitCost;
    	this.expiryDate= expiryDate;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public MyDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(MyDate expiryDate) {
		this.expiryDate = expiryDate;
	}
}
