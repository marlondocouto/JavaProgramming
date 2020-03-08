
public class Point {
	//declaring the information it knows:
	//state of the object:
	//private encapsulates the object:
	private int x;
	private int y;
	
	//constructor ONE:
	public Point(int initialX, int initialY) {
		x = initialX;
		y = initialY;
		}
	
		//second constructor which will allow us to create object without the
		//parameters inside it:
	public Point() {
		x = 0;
		y = 0;
		//could be shortened to this(0,0);
		}
	
	//method
	public void translate(int dx, int dy) {
		//example of mutator: changes the state of the object:
		x += dx;
		y += dy;
	}
	public double distanceFromOrigin() {
		//example of accessor: doesnt change the state:
		return Math.sqrt(x*x + y*y);
	}
	public String toString() {
		//implicit parameter toString:
		return "(" + x + ", " + y + ")";
	}
	//returns the x value:
	public int getX() {
		return x;
	}
	//returns the y value:
	public int getY() {
		return y;
	}
	
}



