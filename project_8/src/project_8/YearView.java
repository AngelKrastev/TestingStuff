package project_8;

import java.util.*;
import javax.swing.JLabel;


public class YearView extends JLabel implements Observer {

	EasterModel model;
	
	public YearView(EasterModel model) {
		
		super();
		this.model = model;
		setText("Year:"+this.model.getYear());
	}
	
	public void update(Observable obs, Object obj) {
		setText("Year:"+this.model.getYear());
	}
}
