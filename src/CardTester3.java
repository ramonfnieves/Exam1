public class CardTester3 {
    public static void main (String args[]) {
    	
        Card card2C = new Card("Club", "2");
        System.out.println(card2C);
        Card card3C = new Card("Club",  "3");
        System.out.println(card3C);
        Card card4C = new Card("Club",  "4");
        System.out.println(card4C);
        Card card2S = new Card("Spade",  "2");
        System.out.println(card2S);
        Card card3S = new Card("Spade",  "3");
        System.out.println(card3S);

        PokerHand testHand = new PokerHand(card2C, card3C, card4C, card2S, card3S);

        System.out.println("Test Hand: " + testHand);
    }
}