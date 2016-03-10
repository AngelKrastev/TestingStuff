package project_8;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener {
	
	EasterModel model;
	JSlider slider;
	
	public SliderListener(EasterModel model, JSlider slider) {
		
		this.model = model;
		this.slider = slider;
	}
	
	public void stateChanged(ChangeEvent e) {
		
		int year = slider.getValue();
		model.setYear(year);
	}
}
