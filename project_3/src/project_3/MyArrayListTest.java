package project_3;

public class MyArrayListTest {
	
	public static void main(String[] args) {
		String string[] = new String[10];
		for (int i = 0; i < string.length; i++) {
			string[i] = "omar";
		}
		MyArrayList arrls = new MyArrayList(string);
		arrls.add("Hasan");
		for (int i = 0; i < 12; i++) {
			System.out.println(arrls.get(i));
		}
	}
}
