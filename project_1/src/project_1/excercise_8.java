package project_1;
import java.util.*;

public class excercise_8 {

	private static Scanner scanner;
	
	public static void main(String args[]) {
		
		scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		if(n>0) {
			boolean sqr=false;
			int i=1;
			while(i<=java.lang.Math.sqrt(n)) {
				if(i*i==n) sqr=true;
				i++;
			}
			if(sqr) System.out.print(n + " is the square of " + java.lang.Math.sqrt(n));
			else System.out.print(n + " is not a square");
		}
	}
}
