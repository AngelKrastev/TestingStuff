package project_2;
import java.util.*;

public class excercise_2 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();   
		System.out.println("Enter a string (enter stop to finish)"); 
		String s = in.nextLine();
		while(!s.equals("stop")) 
		{
			list.add(s);
			System.out.println("Enter a string (enter stop to finish)");
			s = in.nextLine();
		}
		int size=list.size();
		for(int i=0;i<size/2;i++)
		{
			s=list.get(i);
			list.set(i,list.get(size-(i+1)));
			list.set(size-(i+1),s);
		}
		System.out.println("The reversed list:");
		for(int i=0;i<size;i++)
			System.out.println(list.get(i));
	}
}
