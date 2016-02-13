package project_2;
import java.util.*;

public class excercise_5 {

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
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++)
		{
			if(!map.containsKey(list.get(i))) map.put(list.get(i), 1);
			else map.put(list.get(i), map.get(list.get(i))+1);
		}
		int occ=0;
		for (String string : list) 
		{
			if(map.get(string)>occ)
				{
				newlist.clear();
				occ=map.get(string);
				}
			if(map.get(string)==occ&&!newlist.contains(string)) newlist.add(string);
		}
		System.out.println("The most frequent words are:");
		for (String string : newlist)
			System.out.println(string);
	}
}
