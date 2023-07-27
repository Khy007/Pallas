package hu.pallas;

public class Two {

	private int value;

	public Integer getValue() {
		return value;
	}
		
	public void setValue(Integer value) {
		this.value=value;
	}

	public void displayInfo() {
		
		for(int a=0; a<3; a++) {
			System.out.println(value);
			
		}
	}
}
