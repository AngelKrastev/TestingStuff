import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class VirusComponent extends JComponent {

	Double[] infected;
	
	public VirusComponent(Population p, int arrsize) {
		infected = new Double[arrsize];
		for (int i = 0; i < infected.length; i++) {
			infected[i] = 1.0*p.howManyInfected()/p.getPopsize();
			p.update();
		}
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		Line2D.Double line1 = new Line2D.Double(getWidth()/5, 2*getHeight()/3, getWidth()/5+infected.length, 2*getHeight()/3);
		g2.draw(line1);
		g2.drawString("Time", getWidth()/5+infected.length/2, 2*getHeight()/3+20);
		line1 = new Line2D.Double(getWidth()/5,getHeight()/3,getWidth()/5,2*getHeight()/3);
		g2.draw(line1);
		g2.drawString("Infections", getWidth()/5-30, getHeight()/3-10);
		for (int i = 0; i < infected.length; i++) {
			line1 = new Line2D.Double(getWidth()/5+i, 2*getHeight()/3-infected[i]*getHeight()/3, getWidth()/5+i, 2*getHeight()/3-infected[i]*getHeight()/3);
			g2.draw(line1);
		}
	}
}

