import java.util.Scanner;

/* This program figure out a number chosen by a human user. The human user will think of a number between 1 and 100. The 
 * program will make guesses and the user will tell the program to guess higher or lower until the program gets the correct number. 
 */
public class Gameone 
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
		int low=1;
		int high =100;
		char youranswer;
		int yourmidpoint;
		
		Scanner keyboard=new Scanner(System.in); // For user to input yes or no. 
		System.out.println("Guess a number between 1 and 100");
	
		do{
			yourmidpoint=getMidpoint(low, high);
			youranswer=getUserResponseToGuess(yourmidpoint);
			
			if (youranswer=='h'&& yourmidpoint!=99)
			{
				low=yourmidpoint+1;
			}
			else if (youranswer=='h'&& yourmidpoint==99)
			{
				System.out.println("Congratulation! The number is 100.");
				break;
			}
			else if (youranswer=='c')
			{
				System.out.println("Congratulation!");
				break;
			}
			else if (youranswer=='l'&& yourmidpoint!=1)
			{
					high=yourmidpoint-1;
			}
			else if (youranswer=='l'&& yourmidpoint==1)
			{
				System.out.println("Congratulation! The number is 1.");
				break;
			}
			else
			{
				break;
			}
		}
		while (youranswer!='c');
	}
	
/** This function have a boolean return type and prompts the user to determine if the user wants to play again. 
 *  
 * @return true if the user wants play again, return false if the user does not want to play again. 
 */
	public static boolean shouldPlayAgain()
	{
		char again;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Do you want to play again? (y/n): ");
		again=keyboard.next().charAt(0);
		if (again=='y')
			return true;
		else
			return false;
	}
	
/** This function prompt user with "is it <guess>? (h/l/c): "
 * Return answer as characters to decide the next guess. 
 */
	public static char getUserResponseToGuess (int guess) 
	{
		char answer;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Is it "+ guess+ "? (h/l/c): ");
		answer=keyboard.next().charAt(0);
		return answer;
	}

/** This function accept two integers, and return the midpoint of the two integers. 
 * 
 * @param low represents the lower boundary of guessing range.
 * @param high represents the upper boundary of guessing range. 
 * @return midpoint of low and high.
 */
	public static int getMidpoint (int low, int high)
	{
		int midpoint;
		midpoint=(low+high)/2;
		return midpoint;
	}
}