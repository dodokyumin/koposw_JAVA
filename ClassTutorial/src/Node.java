
public class Node {
	
	private int x;
	private int y;
	
	public int getx ( ) {
		return x;
	}
	
	public void setx (int x) {
		this.x = x;
	}
	
	public int gety ( ) {
		return y;
	}
	
	public void sety (int y) {
		this.x = y;
	}
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getGaunde(Node other) {
		return new Node((this.x + other.getx()) / 2, (this.y + other.gety()) / 2);
	}
	
}
