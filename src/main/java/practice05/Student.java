package practice05;


public class Student extends Person{
	
	public String klass;
	
	public Student(String name, int age, String klass) {
		super(name, age);
		this.klass=klass;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String introduce() {
		// TODO Auto-generated method stub

		return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %s .", this.getName(), this.getAge(),this.klass);
	}
}
