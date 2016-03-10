package project_8;

import java.util.*;

public class EasterModel extends Observable {

	Easter easter;
	
	public EasterModel(Easter easter) {
		
		super();
		this.easter = easter;
	}
	
	public void setYear(int year) {
		
		this.easter.setYear(year);
		setChanged();
		notifyObservers();
	}
	
	public int getYear() {
		return this.easter.getYear();
	}
	
	public int getMonth() {
		return this.easter.getMonth();
	}
	
	public int getDay() {
		return this.easter.getDay();
	}
}
