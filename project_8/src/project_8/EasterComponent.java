package project_8;

import javax.swing.JPanel;
import javax.swing.JSlider;

public class EasterComponent extends JPanel {
	
	public EasterComponent(Easter easter, int minyear, int maxyear, int initialyear) {
		
		EasterModel model = new EasterModel(easter);
		
		EasterView eview = new EasterView(model);
		YearView yview = new YearView(model);
		model.addObserver(eview);
		model.addObserver(yview);
		
		JSlider slider = new JSlider(minyear, maxyear, initialyear);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(100);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels(100));
		SliderListener listener = new SliderListener(model, slider);
		slider.addChangeListener(listener);
		
		add(yview);
		add(slider);
		add(eview);
	}
}
