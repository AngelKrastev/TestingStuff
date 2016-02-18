import javax.swing.JFrame;

import java.awt.Component;
import java.util.ArrayList;
public class FrameTest
{

	public static void main(String[] args)
	{
		
		
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//RectangleComponent comp = new RectangleComponent(100, 100);
		//SnowmanComponent comp = new SnowmanComponent(200, 100, 50);
		//frame.add(comp); 
		//HouseComponent comp = new HouseComponent(20,100);
		StreetComponent comp = new StreetComponent(20,100,100,100,3);
		frame.add(comp);
		frame.setVisible(true);
	}
}
