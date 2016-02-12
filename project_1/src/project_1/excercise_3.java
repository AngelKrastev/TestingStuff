package project_1;
import java.util.*;

public class excercise_3 {
	
	private static Scanner scanner;
	
	public static void main(String args[]) {
		
		scanner = new Scanner( System.in );
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		if(n<=0) System.out.print("A positive number is required.");
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++) System.out.print("*");
			System.out.println();
		}
	}
}
