import java.util.Scanner;

public class Clcchar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double result;
		System.out.println("Enter First Number:");
		double a=sc.nextDouble();
		System.out.println("Enter Second Number:");
		double b=sc.nextDouble();
		System.out.println("Choose operetor:(+,-,*,/)");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			result=a+b;
			System.out.println("Adition of two numbers :" +result);
			break;

		case '-':
			result=a-b;
			System.out.println("Substraction of two numbers :" +result);
			break;

		case '*':
			result=a*b;
			System.out.println("Multiplication of two numbers :" +result);
			break;

		case '/':
		 	result=a/b;
			System.out.println("divison of two numbers :" +result);
			break;

		default:
			System.out.println("Invalid Input!!");
			break;	
		}
	}
}