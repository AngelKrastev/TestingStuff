import java.awt.Graphics;

import javax.swing.JComponent;


public class StreetComponent extends JComponent {
	private House[] houses;
	
	public StreetComponent(int xCoord, int yCoord, int width, int height, int size) {
		super();
		houses = new House[size];
		int x = xCoord;
		for (int i = 0; i < size; i++) {
			houses[i] = new House(x, yCoord, width, height);
			x+=width+10;
		}
	}
	
	public void paintComponent(Graphics g) {
		for (int i = 0; i < houses.length; i++) {
			houses[i].draw(g);
		}
	}
}
