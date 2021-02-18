import java.util.Scanner;

public class HighScoresProgram {
	/**
	 * The main method introduces two new arrayLists and calls three methods: initialize, sort, and 
	 * display methods. 
	 * @param args The main purpose of this program is returning sorted a list of scores.
	 */
	public static void main (String[] args) {
		HighScores[] scores=new HighScores[5];
		initialize (scores);
		sort(scores);
		System.out.println(" ");
		System.out.println("Top Scorers: ");
		display(scores);
	}
	
	/**
	 * The initialize method asks the user to enter five names and five scores to one array of HighScores. 
	 * @param scores contains five names and five scores;
	 */
	public static void initialize (HighScores[] scores) {
		Scanner keyboard=new Scanner(System.in);
		int yourScore;
		String yourName;
		for (int count=0; count<5;count++) {
			System.out.print("Enter name for score #"+(count+1)+": ");
			yourName=keyboard.next();
			System.out.print("Enter score for score #"+(count+1)+": ");
			yourScore=keyboard.nextInt();
			scores[count]=new HighScores(yourName, yourScore);
			scores[count].setName(yourName);
			scores[count].setScore(yourScore);
		}
		keyboard.close();
	}
	
	/**
	 * The sort method calls swap methods to sort the score array list in descending order. 
	 * @param scores contains five names and five scores;
	 */
	public static void sort(HighScores[] scores) 
	{
		for (int a = 0; a <= 5; a++) 
		{
			for (int i = 0; i < 4 - a; i++)
			{
				if (scores[i].getScore() < scores[i + 1].getScore())
				{
					int temp;
					temp=scores[i].getScore();
					scores[i].setScore(scores[i + 1].getScore());
					scores[i + 1].setScore(temp);
					String tempstring;
					tempstring=scores[i].getName();
					scores[i].setName(scores[i + 1].getName());
					scores[i + 1].setName(tempstring);
				}
			}
		}
	}

	/**
	 * The display method displays the sorted array lists of names and scores.
	 * @param scores scores contains five names and five scores;
	 */
	public static void display(HighScores[] scores) {
		int count;
		for (count=0; count<5; count++) {
			System.out.println(scores[count].getName()+": "+scores[count].getScore());
		}
	}
}

/** Output 1:
Enter name for score #1: Shuliu
Enter score for score #1: 999999
Enter name for score #2: Lamiya
Enter score for score #2: 56
Enter name for score #3: Kevin
Enter score for score #3: 98
Enter name for score #4: TIm
Enter score for score #4: 85
Enter name for score #5: Bob
Enter score for score #5: 1
 
Top Scorers: 
Shuliu: 999999
Kevin: 98
TIm: 85
Lamiya: 56
Bob: 1

Output 2:
Enter name for score #1: Domilo
Enter score for score #1: 789
Enter name for score #2: Kevin
Enter score for score #2: 85
Enter name for score #3: Cherlie
Enter score for score #3: 65
Enter name for score #4: Doris
Enter score for score #4: 23
Enter name for score #5: Macy
Enter score for score #5: 12
 
Top Scorers: 
Domilo: 789
Kevin: 85
Cherlie: 65
Doris: 23
Macy: 12
*/
