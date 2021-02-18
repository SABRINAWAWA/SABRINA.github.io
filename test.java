
public class test {
	public static void main(String[] args)
	{
		NumberGuesser ng=new NumberGuesser(1,10);
		System.out.println(ng.getCurrentGuess());
		System.out.println(ng.getCurrentGuess());
		System.out.println(ng.getCurrentGuess());
		
		RandomNumberGuesser rng=new RandomNumberGuesser(1,10);
		System.out.println(rng.getCurrentGuess());
		System.out.println(rng.getCurrentGuess());
		System.out.println(rng.getCurrentGuess());
	}
}
