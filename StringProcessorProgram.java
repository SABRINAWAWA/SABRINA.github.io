// This program asks the user for a line of text, and then displays number of 
// words, upper case, digits, and digits words, text without whitespaces, text without 
// vowels, and text without digit words. 
// Programmer: Sabrina (Huiying) Wang
import java.util.Scanner;
public class StringProcessorProgram 
{
	public static void main(String[] args)
	{
		char again; // Set variable for repeating program.
		do // Using do-while loop to repeat program.
		{
		String text;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		text=keyboard.nextLine();
		
		StringProcessor process=new StringProcessor(text); // Create new StringProcessor.
		// Display number of words, upper case characters, digits, and digit words. Also, 
		// display different texts after removing whitespace, vowels and digit words. 
		System.out.println("words: "+process.wordCount());
		System.out.println("uppercase: "+process.uppercaseCount());
		System.out.println("digits: "+process.digitCount());
		System.out.println("digit words: "+process.digitWordCount());
		System.out.println("line with whitespace removed: "+process.getNoSpaceString());
		System.out.println("line with vowels replaced: "+process.getNoVowelString());
		System.out.println("line with digit words replaced: "+process.getNoDigitWordString());
		
		// Ask user if he or she want to repeat program.
		System.out.print("Do you want to enter another? (y/n): ");
		again=keyboard.nextLine().charAt(0);
		}
		while(Character.toUpperCase(again)=='Y');	// repeat program if the user enter 'y'.
	}
}

/* Output: 
Enter a line of text: One for the money, two for the show
words: 8
uppercase: 1
digits: 0
digit words: 2
line with whitespace removed: Oneforthemoney,twofortheshow
line with vowels replaced: -n- f-r th- m-n-y, tw- f-r th- sh-w
line with digit words replaced: 1 for the money, 2 for the show
Do you want to enter another? (y/n): y
Enter a line of text: 3 Blind Mice is one of my favorite songs
words: 9
uppercase: 2
digits: 1
digit words: 1
line with whitespace removed: 3BlindMiceisoneofmyfavoritesongs
line with vowels replaced: 3 Bl-nd M-c- -s -n- -f my f-v-r-t- s-ngs
line with digit words replaced: 3 Blind Mice is 1 of my favorite songs
Do you want to enter another? (y/n): y
Enter a line of text: I have three applies, TWO pears, and nine watermelons.
words: 9
uppercase: 4
digits: 0
digit words: 3
line with whitespace removed: Ihavethreeapplies,TWOpears,andninewatermelons.
line with vowels replaced: - h-v- thr-- -ppl--s, TW- p--rs, -nd n-n- w-t-rm-l-ns.
line with digit words replaced: I have 3 applies, 2 pears, and 9 watermelons.
Do you want to enter another? (y/n): n
*/
