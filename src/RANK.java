import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum RANK {
	A(1), TWO(2), THREE(3) , FOUR(4), FIVE(5), SIX(6) , SEVEN(7) ,EIGHT(8), NINE(9) , T(10) , J(11) , Q(12) , K(13); 
	
	private int value; 
	private RANK(int value) { this.value = value;}
	
	public String getRankString(){
		if (value>1 && value<10)
		return String.valueOf(value);
		
		return this.toString();
	}
	
	public int getRankValue(){
		
		return value;
	}
	
	private static final List<RANK> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
		  private static final int SIZE = VALUES.size();
		  private static final Random RANDOM = new Random();

		  public static RANK randomRank()  {
		    return VALUES.get(RANDOM.nextInt(SIZE));
		  }

}; 
