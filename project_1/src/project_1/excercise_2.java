package project_1;
import java.util.*;

public class excercise_2 {

	private static Scanner scanner;
	
	public static void main(String args[]) {
		
		scanner = new Scanner ( System.in );
		boolean b=false;
		int number,min_number=0;
		System.out.print("Enter a number:");
		number = scanner.nextInt();
		while(number>=0) {
			if(!b||number<min_number) {
				min_number=number;
				b=true;
			}
			System.out.print("Enter a number:");
			number = scanner.nextInt();
		}
		if(b) System.out.print("The smallest number is:" + min_number);
	}
}
