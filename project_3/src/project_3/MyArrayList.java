package project_3;

public class MyArrayList {
	private String[] string;
	private int stored;
	private int size;
	
	public void copy(String[] string1,String[] string2) {
		for (int i = 0; i < string2.length; i++) {
			string1[i] = string2[i];
		}
	}
	
	public MyArrayList() {
		this.size = 10;
		this.stored = 0;
		this.string = new String[size];
	}
	
	public void add(String string) {
		if(stored>=size-1) {
			size+=10;
			String[] s = new String[size];
			copy(s,this.string);
			this.string = s;
		}
		this.string[stored] = string;
		stored++;
	}
	
	public String get(int index) {
		if(index>=0&&index<stored) {
			return string[index];
		}
		else {
			System.out.println("Index out of bounds");
			return null;
		}
	}
}