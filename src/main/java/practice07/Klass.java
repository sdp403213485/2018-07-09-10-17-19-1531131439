package practice07;

public class Klass {
	private int number;

	public Klass(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public String getDisplayName() {
		return "Class "+ this.number;
	}

	
	}