/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String [] rank1 = {"Nine", "Ten", "Jack", "Queen", "King"};
		String [] suit1 = {"Hearts", "Spades", "Diamonds", "Spades", "Clubs"};
		int [] value1 = {9, 10, 11, 12, 13};
	    Deck deck1 = new Deck(rank1, suit1, value1);
	    
	    System.out.println("# of cards: " + deck1.size());
	    
	    String [] rank2 = {"Ace", "Two", "Nine"};
	    String [] suit2 = {"Diamonds", "Clubs", "Hearts"};
	    int [] value2 = {1, 2, 9};
	    Deck deck2 = new Deck(rank2, suit2, value2);
	    System.out.println("Deck2 is not empty: " + !deck2.isEmpty());
	    
	    String [] rank3 = {"Four", "Five", "Nine"};
	    String [] suit3 = {"Clubs", "Diamonds", "Hearts"};
	    int [] value3 = {4, 5, 9};
	    Deck deck3 = new Deck(rank3, suit3, value3);
	    System.out.print("Card dealt: " + deck3.deal());
	   
	}
}
