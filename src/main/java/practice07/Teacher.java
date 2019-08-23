package practice07;
import practice07.Student;

public class Teacher extends Person{
	private Klass klass;

	public Teacher(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
	}

	


	public Teacher(String name, int age) {
		super(name, age);
	}




	public Klass getKlass() {
		return klass;
	}




	public void setKlass(Klass klass) {
		this.klass = klass;
	}




	@Override
	public String introduce() {
		if(this.klass == null) {
			return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", this.getName(), this.getAge());
		} else {
			return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", this.getName(), this.getAge(), this.getKlass().getNumber());
		}
	}
	
	
	public String introduceWith(Student stu) {
		if(stu.getKlass().getNumber()==this.klass.getNumber()) {
			
			return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", this.getName(), this.getAge(),stu.getName());
		} else {
			return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.", this.getName(), this.getAge(),stu.getName());
		}
		
	}
}