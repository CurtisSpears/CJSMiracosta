package edu.miracosta.cs113;

public class Main {

	//Constants *************************************
	private static String PALINDROME_EVEN1 = "redder";
	private static String PALINDROME_EVEN_SPACED = "red der";
	private static String PALINDROME_ODD1 = "redivider";
	private static String PALINDROME_ODD_SPACED = "redi v ider";
	private static String PALINDROME_CAPITALIZED= "Noon";
	private static String PALINDROME_SENTENCE = "Sore was I ere I saw Eros";
	private static String SINGLE_CHAR = "a";
	private static String BLANK_STRING = "";
	private static String NON_PALINDROME1 = "adf hjd vg sfjhsv";
	private static String NON_PALINDROME2 = "word";
	private static String NON_PALINDROME3 = "ac";
	
	
	public static void main(String[] args) {
		
		//Palindrome Tests ***********************************************************************************
		System.out.println("PALINDROME TESTS");
		System.out.println(PALINDROME_EVEN1 + ": " + CheckPalindrome.checkPalindrome(PALINDROME_EVEN1));
		System.out.println(PALINDROME_EVEN_SPACED + ": " + CheckPalindrome.checkPalindrome(PALINDROME_EVEN_SPACED));
		System.out.println(PALINDROME_ODD1 + ": " + CheckPalindrome.checkPalindrome(PALINDROME_ODD1));
		System.out.println(PALINDROME_ODD_SPACED + ": " + CheckPalindrome.checkPalindrome(PALINDROME_ODD_SPACED));
		System.out.println(PALINDROME_CAPITALIZED + ": " + CheckPalindrome.checkPalindrome(PALINDROME_CAPITALIZED));
		System.out.println(PALINDROME_SENTENCE + ": " + CheckPalindrome.checkPalindrome(PALINDROME_SENTENCE));
		System.out.println(SINGLE_CHAR + ": " + CheckPalindrome.checkPalindrome(SINGLE_CHAR));
		
		//Non Palindrome Tests *******************************************************************************
		System.out.println("\n\nNON PALINDROME TESTS");
		System.out.println("(BLANK STRING (FALSE))" + BLANK_STRING + ": " + CheckPalindrome.checkPalindrome(BLANK_STRING));	
		System.out.println(NON_PALINDROME1 + ": " + CheckPalindrome.checkPalindrome(NON_PALINDROME1));
		System.out.println(NON_PALINDROME2 + ": " + CheckPalindrome.checkPalindrome(NON_PALINDROME2));
		System.out.println(NON_PALINDROME3 + ": " + CheckPalindrome.checkPalindrome(NON_PALINDROME3));
		
	}
	
}
