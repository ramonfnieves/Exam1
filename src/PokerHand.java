
public class PokerHand {

	private Card c1;
	private Card c2;
	private Card c3;
	private Card c4;
	private Card c5;
	
	
	public PokerHand(Card c1, Card c2, Card c3, Card c4, Card c5){
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		this.c4=c4;
		this.c5=c5;
		
	}
	
	public String toString() {
        return "[" + c1.toString()  + "," + c2.toString() + "," + c3.toString() + "," + c4.toString() + "," + c5.toString() + "]";
	}

	public int countByRank(Card c) {
		int n=0;
		if(this.c1.hasSameRankAs(c)){ n++; }
		if(this.c2.hasSameRankAs(c)){ n++; }
		if(this.c3.hasSameRankAs(c)){ n++; }
		if(this.c4.hasSameRankAs(c)){ n++; }
		if(this.c5.hasSameRankAs(c)){ n++; }
		return n;
	}

	public boolean threeOfAKind() {
		boolean result=false;  
		if(this.c1.isTrio(c3, c2)){
			result = true;
		}
		if(this.c1.isTrio(c4, c5)){
			result = true;
		}
		if(this.c1.isTrio(c2, c4)){
			result = true;
		}
		if(this.c1.isTrio(c3, c5)){
			result = true;
		}
		return result;
	}
}
