import java.util.Scanner;

public class largthree {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	double a=sc.nextDouble();
	System.out.println("Enter second number:");
	double b=sc.nextDouble();
	System.out.println("Enter third number:");
	double c=sc.nextDouble();
	
	double max = (a>b)?((a>c)?a:c) : ((b>c)?b:c);
	System.out.println("This number is largest number:" +max);
}
}
