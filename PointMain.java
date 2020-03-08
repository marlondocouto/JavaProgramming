
public class PointMain {

	public static void main(String[] args) {
		//Create the object and add the points:
		Point p1 = new Point(7,2);
		Point p2 = new Point();
		
		// print each point and its distance from the origin
		System.out.println("p1 is (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("distance from origin = " + p1.distanceFromOrigin());
		
		System.out.println("p2 is (" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("distance from origin = " + p2.distanceFromOrigin());
		System.out.println();
		
		//translate each point to a new location
		p1.translate(11,6);
		p2.translate(1,7);
		
		//print the points again
		System.out.println("p1 is " + p1);
		System.out.println("p2 is " + p2);
		}
		
}


