/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Eight", "Seven", "Eight"};
		String[] suits = {"Hearts", "Diamonds", "Spades"};
		int[] values = {8, 7, 8};
		Deck deck = new Deck(ranks, suits, values);

		System.out.println(deck.isEmpty());
		System.out.println(deck.size());
		deck.deal();
		deck.deal();
		deck.deal();
		System.out.println(deck.isEmpty());
		System.out.println(deck.size());

	}
}
