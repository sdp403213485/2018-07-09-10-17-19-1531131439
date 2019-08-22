package practice01;

public class Person {
	public String name;
	public int age;
	

	public String introduce() {
		return String.format("My name is %s. I am %d years old.", this.name, this.age);
	}
	
}
