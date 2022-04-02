package myprogram;
import java.util.*;
class interest{
	double p;
	double r;
	double n;
	
	double calcuatesimpleinterest() {
		return p*r*n/100;
	}
}
public class simple_interest {
public static void main(String[] args) {
	interest in=new interest();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principle:");
	in. p=sc.nextDouble();
	System.out.println("Enter rate:");
	in. r=sc.nextDouble();
	System.out.println("Enter number of year:");
	in. n=sc.nextDouble();
	
	System.out.println("Answer:" +in.calcuatesimpleinterest());
	
}
}
