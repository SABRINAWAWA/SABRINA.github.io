import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {
	
	private int randomValue;
	private boolean randomValueNeedsUpdating;
	private Random generator;
	
	public RandomNumberGuesser(int l, int h) {
		super(l, h);
		
		randomValueNeedsUpdating = true;
		generator = new Random();
	}
	
	public int getCurrentGuess() {
		
		if (randomValueNeedsUpdating) {
			randomValue = low + (generator.nextInt((high - low) + 1));
			randomValueNeedsUpdating = false;
		}
		
		return randomValue;
	}
	
	public void higher(){
		super.higher();
		randomValueNeedsUpdating = true;
		if (low==getCurrentGuess())
			throw new IllegalStateException("You are cheating!");
	}
	
	public void lower(){
		super.lower();
		randomValueNeedsUpdating = true;
		if (high==getCurrentGuess())
			throw new IllegalStateException("You are cheating!");
	}
	
	public void reset() {
		super.reset();
		randomValueNeedsUpdating = true;
	}
	
}