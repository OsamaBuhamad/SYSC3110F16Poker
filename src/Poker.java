
public class Poker {

	
	
	public static void main(String[] args){
		
		Hand h = new Hand(); 
		System.out.println(h.handString());
		System.out.println("is flush? "+ h.isFlush());
		System.out.println("is straight? "+ h.isStraight());
		System.out.println("is pair? "+ h.isPair());
		System.out.println("is 3 of kind? "+ h.is3ofAKind());
		System.out.println("is 4 of kind? "+ h.is4ofAKind());
		System.out.println("is high card? "+ h.isHighCard());
		System.out.println("is straightFlush? "+ h.isStraightFlush());
		
		
	}
	
	public void printHandType(Hand h){
		
	}
	
	
	
}
