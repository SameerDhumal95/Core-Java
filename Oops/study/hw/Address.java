package study.hw;

public class Address {
	
		private String area;
		private String city;
		private String state;
		private int pin;
		
		Address(){}
		
		Address(String area,String city,String state,int pin){
			this.area=area;
			this.city=city;
			this.state=state;
			this.pin=pin;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}
		
		public String toString() {
			String str=""+this.area+", "+this.city
					+"\n"+this.state+" Pin: "+this.pin;
			return str;
		}
	

}
