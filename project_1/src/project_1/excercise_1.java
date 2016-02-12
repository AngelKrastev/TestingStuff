package project_1;
import java.util.*;

public class excercise_1 {
	
	private static Scanner scanner;

	public static void main(String args[]) { 
		
		scanner = new Scanner( System.in );
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		for(int i=0;i<=number;i=i+2) System.out.println(i);
		}

}
