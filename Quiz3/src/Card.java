package pkgCore;
import pkgEnum.*;

public class Card implements Comparable {

	private eRank rank;
	private eSuit suit;
	
	public Card(eSuit suit, eRank rank) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	public eRank geteRank() {
		return this.rank;
		
	}
	private void seteRank(eRank rank) {
		this.rank = rank;
	}
	
	public eSuit geteSuit() {
		return this.suit;
	}
	private void seteSuit(eSuit suit) {
		this.suit = suit;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

}
	
}
