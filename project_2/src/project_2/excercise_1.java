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
		ArrayList<String> newlist = new ArrayList<>();
		int longest=0;
		for (String string : list) {
			if(longest<string.length())
			{
				newlist.clear();
				longest=string.length();
			}
			if(longest==string.length()&&!newlist.contains(string)) newlist.add(string);
		}
		System.out.println("The longest words are:");
		for (String string : newlist) 
			System.out.println(string);
	}
}
