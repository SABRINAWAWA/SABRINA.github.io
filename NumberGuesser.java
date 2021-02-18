
public class NumberGuesser {
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	
	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	public void higher() {
		low = getCurrentGuess() + 1;
		if (low==getCurrentGuess())
			throw new IllegalStateException("You are cheating!");
	}
	
	public void lower(){
		high = getCurrentGuess() - 1;
		if (high==getCurrentGuess())
			throw new IllegalStateException("You are cheating!");
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}