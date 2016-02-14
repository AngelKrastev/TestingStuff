package project_3;
import java.util.*;

public class MyArrayListTest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MyArrayList arrls = new MyArrayList();
		for (int i = 0; i < 10; i++) {
			arrls.add(in.next());
		}
		arrls.add("Hasan");
		for (int i = 0; i < 12; i++) {
			System.out.println(arrls.get(i));
		}
	}
}
