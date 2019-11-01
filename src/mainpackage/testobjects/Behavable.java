package mainpackage.testobjects;

/** Made for student behaving purposes.
 * 
 * @author Roman Kuznetcov
 *
 */

public interface Behavable {

	/** Every student must raise a hand when they know an answer.
	 * 
	 */
	void raiseHand();
	
	/**
	 * Every student must shout a mark he/she received to a teacher.
	 */
	void shoutMark(int mark);
	
}
