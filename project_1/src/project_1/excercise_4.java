package project_1;
import java.util.*;

public class excercise_4 {

	private static Scanner scanner;
	
	public static void main(String args[]) {
		
		scanner = new Scanner( System.in );
		System.out.print("Enter a string:");
		String s = scanner.nextLine(),s_reversed="";
		for(int i=s.length()-1;i>=0;i--) s_reversed += s.charAt(i);
		System.out.println(s + " reversed is " + s_reversed);
		if(s.compareTo(s_reversed)==0) System.out.print("It is a palindrome.");
		else System.out.print("It is not a palindrome.");
	}
}