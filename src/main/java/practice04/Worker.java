package practice04;


public class Worker extends Person{

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String introduce() {
		// TODO Auto-generated method stub

		return String.format("My name is %s. I am %d years old. I am a Worker. I have a job.");
	}
	
	
}