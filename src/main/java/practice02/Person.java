package practice02;


public class Person {
	public String name;
	public int age;
	
	
	
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String introduce() {
		return String.format("My name is %s. I am %d years old.", this.name, this.age);
	}
	
}
