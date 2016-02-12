package project_1;
import java.util.*;

public class excercise_7 {

	private static Scanner scanner;
	
	public static void main(String args[]) {
		
		scanner = new Scanner( System.in );
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		if(n>0) {
			boolean prime=true;
			int i=2;
			while(i<java.lang.Math.sqrt(n)) {
				if(n%i==0) prime=false;
				i++;
			}
			if(prime) System.out.println(n + " is a prime.");
			else System.out.println(n + " is not a prime.");
		}
	}
}
