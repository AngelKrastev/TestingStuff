import java.awt.*;
import javax.swing.JComponent;


public class HouseComponent extends JComponent {
	private House house;
	
	public HouseComponent (int xCoord, int yCoord, int width, int height) {
		super();
		house = new House(xCoord, yCoord, width, height);
	}
	
	public void paintComponent(Graphics g) {
		house.draw(g);
	}

}
