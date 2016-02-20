import javax.swing.JFrame;

public class VirusViewer {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Population pop = new Population(100, 0.1, 0.85, 0.2);
		VirusComponent vc = new VirusComponent(pop, 250);
		frame.add(vc);
		frame.setVisible(true);
	}
}
