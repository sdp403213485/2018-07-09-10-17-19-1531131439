package practice07;



public class Student extends Person{
	
	private Klass klass;

	
	
	public Student(String name, int age,  Klass klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}

	



	public Klass getKlass() {
		return klass;
	}



	public void setKlass(Klass klass) {
		this.klass = klass;
	}







	@Override
	public String introduce() {
		// TODO Auto-generated method stub

		return String.format("My name is %s. I am %d years old. I am a Student. I am at Class 2.", this.name,this.age,this.klass.getNumber());
	}

	
	
}
