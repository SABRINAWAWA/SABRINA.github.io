import java.util.Scanner;

/* This program figure out a number chosen by a human user. The human user will think of a number between 1 and 100. 
 * The program will make guesses and the user will tell the program to guess higher or lower until the program
 * gets the correct number. 
 */

public class GuessingPrograms 
{
	public static void main(String[] args)
	{
			do 
			{
				playOneGame();
			}
			while (shouldPlayAgain());
	}
	
	/** This function goes through the whole number guessing game by using both getUserResponsetoGuess and getMidpoint 
	 * functions. 
	 */
	public static void playOneGame() 
	{
		char youranswer;
		Scanner keyboard=new Scanner(System.in); // For user to input yes or no. 
		System.out.println("Guess a number between 1 and 100");
		NumberGuesser guess=new NumberGuesser(1,100);

		do
		{
			youranswer=getUserResponseToGuess(guess.getCurrentGuess());
			
			if (youranswer=='h')
				guess.higher();
			else if (youranswer=='l')
				guess.lower();
			else if (youranswer=='c') 
			{
				System.out.println("You picked "+guess.getCurrentGuess()+"? Great pick.");
				break;
			}
			else
			{
				System.out.println("Please enter h(higher), l(lower), or c (correct).");
				break;
			}
		}
		while (youranswer!='c');
		
	}
	
	/** This function prompt user with "is it <guess>? (h/l/c): "
	 * Return answer as characters to decide the next guess. 
	 */
	public static char getUserResponseToGuess (int guess) 
	{
		char answer;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Is it "+ guess+ "? (h/l/c): ");
		answer=keyboard.next().charAt(0);
		return answer;
	}
	
	/** This function have a boolean return type and prompts the user to determine if the user wants to play again. 
	 *  
	 * @return true if the user wants play again, return false if the user does not want to play again. 
	 */
	public static boolean shouldPlayAgain()
	{
		char again;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Do you want to play again? (y/n): ");
		again=keyboard.next().charAt(0);
		if (again=='y')
			return true;
		else
			return false;
	}
}

/* Output:
Guess a number between 1 and 100
Is it 50? (h/l/c): n
Please enter h(higher), l(lower), or c (correct).
Do you want to play again? (y/n): y
Guess a number between 1 and 100
Is it 50? (h/l/c): h
Is it 75? (h/l/c): h
Is it 88? (h/l/c): h
Is it 94? (h/l/c): h
Is it 97? (h/l/c): h
Is it 99? (h/l/c): h
Is it 100? (h/l/c): c
You picked 100? Great pick.
Do you want to play again? (y/n): y
Guess a number between 1 and 100
Is it 50? (h/l/c): l
Is it 25? (h/l/c): l
Is it 12? (h/l/c): l
Is it 6? (h/l/c): l
Is it 3? (h/l/c): l
Is it 1? (h/l/c): c
You picked 1? Great pick.*/
