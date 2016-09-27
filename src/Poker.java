
public class Poker {

	
	
	public static void main(String[] args){
		
		Hand h = new Hand(); 
		System.out.println(h.handString());
		System.out.println("is flush? "+ h.isFlush());
		System.out.println("is straight? "+ h.isStraight());
		
		System.out.println("is straightFlush? "+ h.isStraightFlush());
		
		System.out.println("num of ? "+ h.getSuitInfo("H"));
	}
	
	public void printHandType(Hand h){
		
	}
	
	
	
}
