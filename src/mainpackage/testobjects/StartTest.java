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
		studentOne.setAge(21);
		System.out.println(studentOne.toString());

	}

}
