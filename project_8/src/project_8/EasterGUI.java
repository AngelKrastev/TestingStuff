package project_8;

import javax.swing.JFrame;

public class EasterGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Easter Dates");
		frame.setSize(250, 250);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Easter easter = new Easter(2000);
		EasterComponent panel = new EasterComponent(easter, 1900, 2100, easter.getYear());
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
