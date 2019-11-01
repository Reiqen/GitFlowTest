package mainpackage.testobjects;

/** Simple program which shows info about an abstract student.
 *  Designed for testing git and git flow features.
 * @author Roman Kuznetcov
 *
 */

public class StartTest {

	public static void main(String[] args) {
		
		Student studentOne = new Student();
		studentOne.setName("John");
		studentOne.setSurname("Johnson");
		studentOne.setAge(21);
		System.out.println(studentOne.toString());
		
		Student studentTwo = new Student();
		studentTwo.setName("Jack");
		studentTwo.setSurname("Smith");
		studentTwo.setAge(20);
		System.out.println(studentTwo.toString());

	}

}
