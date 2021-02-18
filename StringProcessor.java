
public class StringProcessor 
{
	private String text;
	private String noSpace;
	private String noVowel;
	private String nodigitWord;
	private String [] digitwords={"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private String [] digits={"0","1","2","3","4","5","6","7","8","9"};
	
	/**
	 * The StringProcessor Constructor initializes the text as a whitespace.
	 */
	public StringProcessor()
	{
		text=" ";
	}
	
	/**
	 * The StringProcessor Constructor initializes the text with s.
	 * @param s The value to store test.
	 */
	public StringProcessor(String s)
	{
		text=s;
	}
	
	/**
	 * The setString method stores a value in the text field.
	 * @param s The value to store test
	 */
	public void setString(String s)
	{
		text=s;
	}
	
	/**
	 * The getString method returns StringProcessor's text.
	 * @return The value in the text field.
	 */
	public String getString()
	{
		return text;
	}
	
	/**
	 * The wordCount method returns the number of words in text field. 
	 * @return The length of words in text.
	 */
	public int wordCount() 
	{
		if (text==null||text.isEmpty())
			return 0;
		String[] words=text.split("\\s+");
		return words.length;
	}
	
	/**
	 * The uppercaseCount method returns the number of uppercase in the text field.
	 * @return The number of uppercase in the text field
	 */
	public int uppercaseCount()
	{
		int upperCase=0; 
		char[] charArray=text.toCharArray();
		for (int i=0; i<charArray.length;i++) 
		{
			if(Character.isUpperCase(charArray[i]))
				upperCase++;
		}
		return upperCase;
	}
	
	/**
	 * The digitCount method returns the number of digits in the text field.
	 * @return The number of digit in the text field
	 */
	public int digitCount()
	{
		int digit=0; 
		char[] charArray=text.toCharArray();
		for (int i=0; i<charArray.length;i++) 
		{
			if(Character.isDigit(charArray[i]))
				digit++;
		}
		return digit;
	}
	
	/**
	 * The digitWordCount method returns the number of digit words in the text field.
	 * @return The number of digit words in the text field
	 */
	public int digitWordCount()
	{
		int digitwordCount=0;
		String [] strArray=text.split(" ");
		for (int i=0; i<strArray.length;i++)
		{
			for (int j=0; j<digitwords.length;j++)
			{
				if (strArray[i].equalsIgnoreCase(digitwords[j])) 
					digitwordCount++;
			}
		}
		return digitwordCount;
	}
	
	/**
	 * The getNoSpaceString method modifies text and deletes all spaces. 
	 * @return The string that without space.
	 */
	public String getNoSpaceString()
	{
		noSpace=text.replace(" ", "");
		return noSpace;
	}
	
	/**
	 * The getNoVowelString method modifies text and replaces all vowels to '-'. 
	 * @return The string that without vowel.
	 */
	public String getNoVowelString()
	{
		noVowel=text.replaceAll("[aeiouAEIOU]", "-");
		return noVowel;
	}
	
	/**
	 * The getNoVowelString method modifies text and replaces all digits to digit words.
	 * @return The string that without digits.
	 */
	public String getNoDigitWordString()
	{
		nodigitWord=text;
		String [] strArray=text.split(" ");
		for (int i=0; i<strArray.length;i++)
		{
			for (int j=0; j<digitwords.length;j++)
			{
				if (strArray[i].equalsIgnoreCase(digitwords[j])) 
				{
					nodigitWord=nodigitWord.replace(strArray[i], digits[j]);
					break;
				}
			}
		}
		return nodigitWord;
	}
}
