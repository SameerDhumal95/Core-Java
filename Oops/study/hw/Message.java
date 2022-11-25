package study.hw;

public class Message {

	private String sendName;
	private String recName;
	private String message;
	private Address recAdd;

	Message()
	{

	}

	Message(String sendName, String recName, String message, Address recAdd){
		this.sendName=sendName;
		this.recName=recName;
		this.message=message;
		this.recAdd=recAdd;
	}

	public String getSendName() {
		return sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Address getRecAdd() {
		return recAdd;
	}

	public void setRecAdd(Address recAdd) {
		this.recAdd = recAdd;
	}

	//getMsg Method
	public static void getMsg(String cityName, Message []msg) {
		int flag=0;
		for(Message msgC : msg) 
		{
			//city name is equals with Address city
			if(cityName.equalsIgnoreCase(msgC.getRecAdd().getCity()))
			{
				System.out.println(msgC);
				flag=1; //if flag=1 then it will ignore second if
			}
		}
		if(flag==0) 
		{
			System.out.println("Invalid City Entered");
		}
	}

	//Message toString method
	public String toString() {
		String str="Sender Name: "+this.sendName
				+"\nReceiver Name: "+this.recName
				+"\nMessage: "+this.message
				+"\nAddress: "+this.recAdd;
		return str;
	}


}
