/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("Four", "Spades", 4);
		Card two = new Card("Four", "Spades", 4);
		Card three = new Card("Two", "Clubs", 2);
		Card four = new Card("Two", "Clubs", 2); //Created to test the matches method.
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		System.out.println("Card One matches Card Two: " + one.matches(two));
		System.out.println("Card One matches Card Four: " + one.matches(four));
		System.out.println("Card Three matches Card Four: " + three.matches(four));
		System.out.println("Card Three matches Card Two: " + three.matches(two));
	}
}
