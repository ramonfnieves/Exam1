public class Card {

	private String suit;
	private String rank;

	public Card(String suit, String rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "[" + rank  + "," + suit + "]";
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public boolean hasSameSuitAs(Card c) {
		boolean result=false;  
		if(this.suit.equals(c.getSuit())){
			result=true;
		}
		return result;
	}

	public boolean hasSameRankAs(Card c) {
		boolean result=false;  
		if(this.rank.equals(c.getRank())){
			result=true;
		}
		return result;
	}

	public boolean isPair(Card c) {
        return (this.hasSameRankAs(c));
	}

	public boolean isTrio(Card c1, Card c2) {
		return (this.isPair(c1)&&this.isPair(c2));
	}

	public boolean isFourTuple(Card c1, Card c2, Card c3) {
		return (this.isPair(c1)&&this.isPair(c2)&&this.isPair(c3));
	}

}