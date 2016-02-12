package project_1;
import java.util.*;

public class excercise_6 {

	private static Scanner scanner;
	
	public static void main(String args[]) {
		
		scanner = new Scanner( System.in );
		System.out.print("Enter a string:");
		String s = scanner.next(),s_low = s.toLowerCase();
		while(!s_low.isEmpty()) {
			char first = s_low.charAt(0);
			int i=1;
			while(i<s_low.length()) {
				if(first>s_low.charAt(i)) first=s_low.charAt(i);
				i++;
			}
			System.out.println(first);
			s_low = s_low.substring(0, s_low.indexOf(first))+s_low.substring(s_low.indexOf(first)+1);
		}
	}
}
