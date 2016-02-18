import java.awt.*;
import java.awt.geom.Line2D;


public class House {
	private Rectangle house, door;
	private Line2D.Double leftline, rightline;
	
	public House(int xCoord, int yCoord, int width, int height) {
		house = new Rectangle();
		house.setRect(xCoord, yCoord, width, height);
		door = new Rectangle();
		door.setRect(xCoord+50, yCoord+2*height/3, width/5, height/3);
		leftline = new Line2D.Double(xCoord, yCoord, xCoord+width/2, yCoord - height/5);
		rightline = new Line2D.Double(xCoord+width, yCoord, xCoord+width/2, yCoord - height/5);
	}
	
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.draw(house);
		g2.draw(door);
		g2.draw(leftline);
		g2.draw(rightline);
	}
	
}
