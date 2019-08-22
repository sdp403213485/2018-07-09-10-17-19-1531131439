package practice03;

public class Worker extends Person{

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String introduce() {
		// TODO Auto-generated method stub

		return String.format("I am a Worker. I have a job.");
	}
	
	
}
