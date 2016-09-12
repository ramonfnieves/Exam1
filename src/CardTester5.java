public class CardTester5 {

	public static void main (String args[]) {

		Card card2C = new Card("Club", "2");
		System.out.println(card2C);

		Card card2S = new Card("Spade",  "2");
		System.out.println(card2S);

		Card card2D = new Card("Diamond",  "2");
		System.out.println(card2D);

		Card card5C = new Card("Club",  "5");
		System.out.println(card5C);

		Card card5D = new Card("Diamond",  "5");
		System.out.println(card5D);

		Card card6C = new Card("Club",  "6");
		System.out.println(card5D);

		PokerHand testHand = new PokerHand(card2C, card2S, card2D, card5C, card6C);

		System.out.println("Test Hand: " + testHand);

		if (testHand.threeOfAKind()) {
			System.out.println("Three of a Kind test passed");
		}

		else {
			System.out.println("Three of a Kind test failed");
		}
	}
}