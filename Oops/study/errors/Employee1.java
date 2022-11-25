package study.errors;

import study.errors.custom.Under18Exception;

import study.has_a.MyDate;

public class Employee1 {

	private String dept, name;
	private MyDate dob;

	//default
	public Employee1()
	{

	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getDob() {
		return dob;
	}

	///////////////////////////////////////////////////////

	public void setDob(MyDate dob) throws Under18Exception  {
		if((2022 - dob.getYy()) >=18  &&  (2022 - dob.getYy())<=70)
			this.dob = dob;
		else if(2022 - dob.getYy()<18)
				{
			throw new Under18Exception();//customized exception
				}
		else
		{
			throw new Above70Exception();
		}

	}

	/* Unchecked Exception HomeWork */

}