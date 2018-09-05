import java.util.Scanner;
/**
*This program asks user for string inputs and find the length, find if the two strings are the same,
*find what the string looks like from certain index to another, remove the spaces, find index of the substring,
*find last index of the substring, find what character is shown in certain index, 
*uppercase the string, lower case the string.
*/
public class StringFun
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();

		System.out.println("Enter another string: ");
		String otherString = in.nextLine();

		System.out.println("Enter a substring: ");
		String subString = in.nextLine();


		System.out.println(s.length());


		System.out.println(s.equals(otherString));

		System.out.println(s.substring(0, s.length()));

		System.out.println(s.trim());

		System.out.println(s.indexOf(subString));

		System.out.println(s.lastIndexOf(subString));

		System.out.println(s.charAt(1));

		System.out.println(s.toUpperCase());

		System.out.println(s.toLowerCase());
	}
}
