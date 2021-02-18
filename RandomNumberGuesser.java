import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser
{
	private int upper;
	private int lower;
	private int upperBound;
	private int lowerBound;
	boolean getanswer;
	private int randomNum;
	
	/**
	 * This RandomNumberGuesser constructor allows user to initiate the lower bound and upper bound.   
	 * @param lowerBound
	 * @param upperBound
	 */
	public RandomNumberGuesser(int lowerBound, int upperBound) 
	{
		super(lowerBound, upperBound);
		upper=upperBound;
		lower=lowerBound;
		getanswer=true;
	}
	
	/**
	 * This getCurrentGuess method chooses a number randomly from the range.
	 * @return the value of random number.
	 */
	@Override
	public int getCurrentGuess() 
	{
		if (getanswer) 
		{
			Random r=new Random();
			randomNum=r.nextInt((upper-lower)+1)+lower;
			getanswer=false;
		}
		return randomNum;
	}
	
	/**
	 * This lower method calculates the upper bound by random number minuses one. 
	 */
	@Override
	public void lower()
	{
		upper=randomNum-1;
		getanswer=true;
	}
	
	/**
	 * This higher method calculates the lower bound by random number pluses one. 
	 */
	@Override
	public void higher()
	{
		lower=randomNum+1;
		getanswer=true;
	}
	
	/**
	 * This reset method resets the value of upper and lower bound to the original value.
	 */
	 @Override
	 public void reset()
	 {
		 upper=upperBound;
		 lower=lowerBound;
		 getanswer=true;
	 }
}
