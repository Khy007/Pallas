package hu.pallas;

public class One {

	private String value;

	public String getValue() {
		return value;
	}
		
	public void setValue(String value) {
		this.value=value;
	}

	public void displayInfo() {
		
		for(int a=0; a<10; a++) {
			if (a<9) {
				System.out.print(value + ", ");
			}
			else {
				System.out.print(value);
			}
		}
	}
}
