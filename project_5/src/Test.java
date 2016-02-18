public class Test
{
	public static void main(String[] args)
	{
		Transmitter t1 = new Transmitter(1.0, 0.5, 80.0);
		Transmitter t2 = new Transmitter(8.0, 1.2, 80.0);
		Transmitter t3 = new Transmitter(17.5, 17.0, 80.0);
		 
		Network net = new Network();
		net.add(t1);
		net.add(t2);
		net.add(t3);

		Network network = new Network();
		double x1 = 5.0;
		double y1 = 2.0;
		Transmitter t4 = new Transmitter(x1, y1, 80);
		network.add(t4);
		double x2 = 3.5;
		double y2 = 18.0;
		Transmitter t5 = new Transmitter(x2, y2, 80);
		network.add(t5);
		
		SignalStrength grid = new SignalStrength(net, 20);
		System.out.println(String.format("%.2f", grid.averageSignal()));
		SignalMap sm = new SignalMap(20, 10, net);
		sm.display();
		System.out.println("Most important "+sm.important().toString());
		sm.compare(network);
		
	}
}