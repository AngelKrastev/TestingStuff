package project_2;
import java.util.*;

public class excercise_1 {
	
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
		int longest=0;
		for(int i=0;i<list.size();i++) 
			if(list.get(i).length()>longest) longest=list.get(i).length();
		System.out.println("The longest words are:");
		for(int i=0;i<list.size();i++)
			if(list.get(i).length()==longest) System.out.println(list.get(i));
	}
}