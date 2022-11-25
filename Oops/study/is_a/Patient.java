package study.is_a;

import study.has_a.MyDate;

public class Patient extends Person {

	
	private String BloodGroop;
	private String BloodPressure;
	private String HeartRate;
	
	
	public Patient()
	{
		this.BloodGroop = null;
		this.BloodPressure = null;
		this.HeartRate = null;
		
	}
	
	public Patient(String name, MyDate dob, String bloodGroup, String bloodPressure, String heartrate)
	{
		super(name, dob); //parent is a persion 
		BloodGroop = bloodGroup;
		BloodPressure = bloodPressure;
		HeartRate = heartrate;		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(super.equals(obj))  //from parent 
		{
		        if(obj instanceof Patient)
		        {	
		        		
		        Patient temp = (Patient)obj;  //reference created = typecasting    
		        if(this.BloodGroop.equals(temp.BloodGroop)
		        &&
		        this.BloodPressure.equals(temp.BloodPressure)
		        &&
		        this.HeartRate==temp.HeartRate)
		        return true;
		        }
		        else
				{
					return false;
				}
		}
		else 
		{
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		//concatinate toString of person
		
		String str = super.toString()+"\nBlood Group : "+this.BloodGroop+
				"\nBlood Pressure : "+this.BloodPressure;
		str+="\n_________________________";
	return str;
	}

	public String getBloodGroop() {
		return BloodGroop;
	}

	public void setBloodGroop(String bloodGroop) {
		BloodGroop = bloodGroop;
	}

	public String getBloodPressure() {
		return BloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		BloodPressure = bloodPressure;
	}

	public String getHeartRate() {
		return HeartRate;
	}

	public void setHeartRate(String heartRate) {
		HeartRate = heartRate;
	}
	
	
}
