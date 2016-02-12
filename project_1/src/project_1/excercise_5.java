package project_1;
import java.util.*;

public class excercise_5 {

	private static Scanner scanner;
	
	public static void main(String args[]) {
		
		scanner = new Scanner( System.in );
		System.out.print("Enter a string:");
		String s = scanner.next(),s_low=s.toLowerCase();
		char first = s_low.charAt(0);
		int i=1;
		while(i<s_low.length()) {
			if(first>s_low.charAt(i)) first=s_low.charAt(i);
			i++;
		}
		System.out.print("The fist character alphabetically is "+first);
	}
}
