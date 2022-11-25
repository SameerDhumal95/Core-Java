package study.hw;

public class StudentNames {
	String[] names;
	static int i=-1;
	
	public StudentNames() {
	}

	public StudentNames(String []names) {
		this.names=names;
	}
	
	public void addNames(String name) {
		if(i<names.length) {
			i++;
			names[i]=name;
		}
		else {
			System.out.println("List is Full");
		}
	}
	
	public String getNameOnIndex(int idx) {
		return names[idx-1];
	}
	
	public void showAllNames() {
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+". "+names[i]);
		}
	}
}
