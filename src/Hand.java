import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	
	private ArrayList<Card> hands;
	private ArrayList<String> suits;
	private ArrayList<Integer> ranks;
	public Hand(){	
		hands = new ArrayList<Card>();
		suits = new ArrayList<String>();
		ranks = new ArrayList<Integer>();
		//this.setHand();
		
		
		Card c = new Card(RANK.TWO,SUIT.D);
		Card c1 = new Card(RANK.THREE,SUIT.D);
		Card c2 = new Card(RANK.FOUR,SUIT.D);
		Card c3 = new Card(RANK.FIVE,SUIT.D);
		Card c4 = new Card(RANK.SIX,SUIT.D);
		hands.add(c);
		hands.add(c1);
		hands.add(c2);
		hands.add(c3);
		hands.add(c4);
		suits.add(c.getSuit());
		suits.add(c1.getSuit());
		suits.add(c2.getSuit());
		suits.add(c3.getSuit());
		suits.add(c4.getSuit());
		ranks.add(c.getCardRank());
		ranks.add(c1.getCardRank());
		ranks.add(c2.getCardRank());
		ranks.add(c3.getCardRank());
		ranks.add(c4.getCardRank());
		
	}
	
	public void setHand(){
		
		for(int i=0; i<5;i++){
			Card c = new Card(); 
			if(hands.contains(c)){
				--i;
			}else{
				hands.add(c);
				suits.add(c.getSuit());
				ranks.add(c.getCardRank()); 
			} 
		}
			
	}
	
	public List<Card> getHand(){
		
		return hands;
	}
	
	public Card getCardFromHand(int index){
		return hands.get(index);
	}
	
	
	
	public String handString(){
		
		String result="the hand is: "; 
		for(Card h:hands)
			result+=h.getCard()+" ";
		
		return result;
		
	}
	public String suitString(){
		
		String result="the suit is: "; 
		for(String h:suits)
			result+=h+" ";
		
		return result;
		
	}
	
	public boolean isFlush(){
		int freq,freq1,freq2,freq3;
		
		freq = Collections.frequency(suits, "C");
		freq1 = Collections.frequency(suits, "D");
		freq2 = Collections.frequency(suits, "H");
		freq3 = Collections.frequency(suits, "S");
		
		return freq==5 || freq1==5|| freq2==5||freq3==5;
	}
	
	public int getSuitInfo(String suit){
		
		int freq=0;
		if(suit.equals("S") || suit.equals("C") || suit.equals("D") || suit.equals("H"))
			
		freq = Collections.frequency(suits,suit);
		
		return freq;
	}
	
	public boolean isStraight(){
	
		Collections.sort(ranks);
		for (int i = 0; i< 4; i++){
			if(ranks.get(i) + 1 != ranks.get(i+1)){
				return false;
			}
		}
			return true;
		}
	public boolean isStraightFlush(){
//		boolean sf=false;
//		boolean sf1=this.isFlush();
//		boolean sf2=this.isStraight();
//		if(this.isFlush()==true&&this.isStraight()==true)
//			sf=true;
//		
		return this.isFlush()==true && this.isStraight()==true;
	}

}
