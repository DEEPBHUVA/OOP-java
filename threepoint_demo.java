//Create a class named ThreeDPoint to model a point in a threedimensional space. Let ThreeDPoint be derived from MyPoint with 
//following additional features:
//o A data fields named z that represents the z-coordinate.
//o A no-arg constructor that creates a point (0, 0, 0).
//o A constructor that constructs a point with three specified 
//coordinates.
//o A get method that returns the z value.
//o Override the distance method to return the distance between two 
//points in the three-dimensional space.
//Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and 
//display the distance between the two points.


package classes_inheritance;
class mypoint1{
	double x,y,z;
	
	public mypoint1() {
		x=0;
		y=0;
		z=0;
	}
	public mypoint1(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double distence(mypoint1 mp) {
		double dis=Math.sqrt(Math.pow(this.x-mp.x, 2)+Math.pow(this.y-mp.y, 2)+Math.pow(this.z-mp.z, 2));
		return dis;
	}
	public double distence(double x,double y,double z) {
		double dis=Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2)+Math.pow(this.z-z, 2));
		return dis;
	}
}
public class threepoint_demo {
public static void main(String[] args) {
	mypoint1 mp1=new mypoint1();
	mypoint1 mp2=new mypoint1(2,2,2);
	System.out.println(mp1.distence(mp2));
}
}
