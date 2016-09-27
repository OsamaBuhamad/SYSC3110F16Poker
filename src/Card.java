import java.util.Collection;


public class Card {
	
	private RANK rank;
	private SUIT suit; 

	public Card(RANK rank, SUIT suit){
		this.rank=rank;
		this.suit=suit;
	}
	
	/**
	 * this is to create a random card (random suit and rank) 
	 */
	public Card(){
		this.rank=rank.randomRank();
		this.suit=suit.randomSUIT();
		
	}
	
	public void setCard(RANK rank, SUIT suit){
		
		
	}
	
	public String getCard(){
		return rank.getRankString()+suit;
	}
	
	public int getCardRank(){
		return rank.getRankValue();
	}
	
	public String getSuit(){
		return this.suit.toString(); 
	}
	
	@Override
	public boolean equals (Object card){
		boolean isSame=false; 
		if(card != null && card instanceof Card) {
			isSame= this.getCard().equals(((Card) card).getCard());
		}
		return isSame;
	}

	

}
