package class_obj_method;
import java.util.Scanner;
class area{
		double r;
		double areaofcircle() {
			return 3.14*r*r;
		}
	}
public class circle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	area c1 = new area();
	System.out.println("Enter redius:");
	c1.r=sc.nextDouble();
	
	System.out.println("Area of circle:"+c1.areaofcircle());
}
}
