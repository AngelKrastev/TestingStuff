package project_8;

import java.util.*;
import javax.swing.JLabel;

public class EasterView extends JLabel implements Observer {
	
	private EasterModel model;
	
	public EasterView(EasterModel model) {
		
		super();
		this.model = model;
		setText("Easter:"+this.model.getDay()+"/"+this.model.getMonth());
	}
	
	public void update(Observable obs, Object obj) {
		setText("Easter:"+this.model.getDay()+"/"+this.model.getMonth());
	}
}
