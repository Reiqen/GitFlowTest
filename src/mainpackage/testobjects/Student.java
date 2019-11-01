package mainpackage.testobjects;

public class Student implements Behavable {

	private String name;
	private String surname;
	private int age;
	private boolean handRaised;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void raiseHand() {
		handRaised = true;
	}

	@Override
	public void shoutMark(int mark) {
		System.out.println("My mark is " + mark);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	
	
}
