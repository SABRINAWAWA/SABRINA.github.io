
public class HighScores {
	private String name;
	private int score;
	
	/**
	 * The HighScores method is a constructor and it initializes the name and score. 
	 * @param n The value to store the name.
	 * @param s The value to store the score.
	 */
	public HighScores(String n, int s) 
	{
		name=n;
		score=s;
	}
	
	/**
	 * The setName method stores a value in name field. 
	 * @param n The value to store the name.
	 */
	public void setName(String n)
	{
		name=n;
	}
	
	/**
	 * The setScore method stores a value in score field.
	 * @param s The value to store the score.
	 */
	public void setScore(int s)
	{
		score=s;
	}
	
	/**
	 * The getName method returns HighScores' object, name.
	 * @return The value in the name field.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * The getScore method returns HighScores' object, score. 
	 * @return The value in the score field.
	 */
	public int getScore()
	{
		return score;
	}
}
