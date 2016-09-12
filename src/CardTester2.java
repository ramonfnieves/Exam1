public class CardTester2 {

	public static void main (String args[]) {

		Card card2C = new Card("Club", "2");
		System.out.println(card2C);

		Card card2S = new Card("Spade", "2");
		System.out.println(card2S);

		Card card2D = new Card("Diamond",  "2");
		System.out.println(card2D);

		Card card2H = new Card("Heart",  "2");
		System.out.println(card2H);

		Card card3C = new Card("Club",  "3");
		System.out.println(card3C);

		if (card2C.isPair(card2D) && !card2C.isPair(card3C)) {
			System.out.println("isPair test passed");
		}

		else {
			System.out.println("isPair test failed");
		}

		if (card2C.isTrio(card2D, card2H) && !card2C.isTrio(card2D, card3C)) {
			System.out.println("isTrio test passed");
		}

		else {
			System.out.println("isTrio test failed");
		}

		if (card2C.isFourTuple(card2D, card2H, card2S) && !card2C.isFourTuple(card2D, card2H, card3C)) {
			System.out.println("isFourTuple test passed");
		}

		else {
			System.out.println("isFourTuple test failed");
		}

	}
}