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
		Card card1 = new Card("Eight", "Spades", 8);
		Card card2 = new Card("Seven", "Hearts", 7);
		Card card3 = new Card("Eight", "Diamonds", 8);
		Card card4 = new Card("Eight", "Diamonds", 8);


		System.out.println(card1.suit());
		System.out.println(card2.rank());
		System.out.println(card3.pointValue());
		System.out.println(card1.suit());
		System.out.println(card2.rank());
		System.out.println(card3.pointValue());
		System.out.println(card1.suit());
		System.out.println(card2.rank());
		System.out.println(card3.pointValue());
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		System.out.println(card2.matches(card3));
		System.out.println(card3.matches(card4));
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);


	}
}
