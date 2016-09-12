public class CardTester {

	public static void main (String args[]) {

		Card card2C = new Card("Club", "2");
		System.out.println(card2C);

		Card card3C = new Card("Club",  "3");
		System.out.println(card3C);

		Card card2D = new Card("Diamond",  "2");
		System.out.println(card2D);

		Card card3D = new Card("Diamond",  "3");
		System.out.println(card3D);

		if (card3D.hasSameSuitAs(card2D)) {
			System.out.println("Same suit test 1 passed");
		}

		else {
			System.out.println("Same suit test 1 failed");
		}

		if (!card2D.hasSameSuitAs(card2C)) {
			System.out.println("Same suit test 2 passed");
		}

		else {
			System.out.println("Same suit test 2 failed");
		}

		if (card3D.hasSameRankAs(card2D)) {
			System.out.println("Same rank test 1 failed");
		}

		else {
			System.out.println("Same rank test 1 passed");
		}

		if (!card2D.hasSameRankAs(card2C)) {
			System.out.println("Same rank test 2 failed");
		}

		else {
			System.out.println("Same rank test 2 passed");
		}

	}

}