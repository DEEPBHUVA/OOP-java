import java.util.Scanner;

public class Swap{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c;
		System.out.println("Enter Number a:");
		int a=s.nextInt();
		System.out.println("Enter Number b:");
		int b=s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Value in a:" +a);
		System.out.println("Value in b:" +b);		
	}
}