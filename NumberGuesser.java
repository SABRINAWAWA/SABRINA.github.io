
public class NumberGuesser 
{
	protected int upper;
	protected int lower;
	private int lowerBound;
	private int upperBound;
	private int midpoint;
	
	/**
	 * This NumberGuesser constructor allows user to initiate the lower bound and upper bound.   
	 * @param lowerBound
	 * @param upperBound
	 */
	public NumberGuesser(int lowerBound, int upperBound)
	{
		upper=upperBound;
		lower=lowerBound;
	}
	
	/**
	 * This lower method calculates the upper bound by midpoint minuses one. 
	 */
	public void lower()
	{
		upper=midpoint-1;
	}
	
	/**
	 * This higher method calculates the lower bound by midpoint pluses one. 
	 */
	public void higher()
	{
		lower=midpoint+1;
	}
	
	/**
	 * This getCurrentGuess method calculates the midpoint.
	 * @return the value of midpoint.
	 */
	public int getCurrentGuess()
	{
		midpoint=(upper+lower)/2;
		return midpoint;
	}
	
	/**
	 * This reset method resets the value of upper and lower bound to the original value.
	 */
	public void reset() 
	{
		lower=lowerBound;
		upper=upperBound;
	}
}
