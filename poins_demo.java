//Design a class named MyPoint to represent a point with x- and ycoordinates. The class contains:
//The data fields x and y that represent the coordinates with getter 
//methods.
//o a no-arg constructor that creates a point (0, 0).
//o a constructor that constructs a point with specified coordinates.
//o a method named distance that returns the distance from this point 
//to a specified point of the MyPoint type.
//o a method named distance that returns the distance from this point 
//to another point with specified x- and y-coordinates.

package classes_inheritance;
class Mypoint{
	double x,y;
	
	public Mypoint() {
		x=0;
		y=0;
	}
	public Mypoint(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double distence(Mypoint mp) {
		double dis=Math.sqrt(Math.pow(this.x-mp.x, 2)+Math.pow(this.y-mp.y, 2));
		return dis;
	}
	public double distence(double x,double y) {
		double dis=Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
		return dis;
	}
}
public class poins_demo {
	public static void main(String[] args) {
		Mypoint mp1=new Mypoint();
		Mypoint mp2=new Mypoint(1,1);
		System.out.println(mp1.distence(mp2));
	}
}
