
public class SignalMap {
	private boolean[][] map;
	private int size;
	private double threshold;
	private Network network;
	
	public SignalMap(int size, double threshold, Network network) {
		this.size = size;
		this.threshold = threshold;
		this.network = new Network();
		for (int i = 0; i < network.size(); i++) {
			this.network.add(network.getTransmitter(i));
		}
		map = new boolean[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(network.getSignal(i, j) < threshold) map[i][j] = true;
				else map[i][j] = false;
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(map[i][j]) System.out.print("X ");
				else System.out.print("O ");
			}
			System.out.println();
		}
	}
	
	public double poorSignal() {
		double count = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(map[i][j]) count++;
			}
		}
		return count/(size*size);
	}
	
	public Transmitter important() {
		int index = 0;
		double mostsignal = 0;
		for (int i = 0; i < network.size(); i++) {
			Network net = new Network();
			net.add(network.getTransmitter(i));
			SignalMap sm = new SignalMap(size, threshold, net);
			if(mostsignal < 1-sm.poorSignal()) {
				index = i;
				mostsignal = 1-sm.poorSignal();
			}
		}
		return network.getTransmitter(index);
	}
	
	public void compare(Network network) {
		System.out.println("Better signal in:");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(network.getSignal(i, j) > this.network.getSignal(i, j)) System.out.print("O ");
				else System.out.print("X ");
			}
			System.out.println();
		}
	}
}
