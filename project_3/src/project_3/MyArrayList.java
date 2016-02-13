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
	
	public MyArrayList(String[] string) {
		this.size = 10;
		this.stored = 0;
		this.string = new String[size];
		if(this.size<string.length) System.out.println("Array too long.Constructor failed.");
		else {
			copy(this.string,string);
			this.stored = string.length;
		}
	}
	
	public void add(String string) {
		if(stored>=size-1) {
			size+=10;
			String[] s = new String[size];
			copy(s,this.string);
			this.string = new String[size];
			copy(this.string,s);
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