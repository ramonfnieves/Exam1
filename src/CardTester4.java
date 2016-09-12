public class CardTester4 {

	public static void main (String args[]) {

		Card card2C = new Card("Club", "2");
		System.out.println(card2C);

		Card card2S = new Card("Spade",  "7");
		System.out.println(card2S);

		Card card2D = new Card("Diamond",  "2");
		System.out.println(card2D);

		Card card5C = new Card("Club",  "2");
		System.out.println(card5C);

		Card card5D = new Card("Diamond",  "2");
		System.out.println(card5D);

		Card card6C = new Card("Club",  "6");
		System.out.println(card6C);

		PokerHand testHand = new PokerHand(card2C, card2S, card2D, card5C, card5D);

		System.out.println("Test Hand: " + testHand);
		
		int n = testHand.countByRank(card2C);
		if (n==3) {
			System.out.println("Count by rank test passed");
		}

		else {
			System.out.println("Count by rank test " +n);
		}
	}
}