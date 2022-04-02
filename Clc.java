import java.util.Scanner;

public class Clc{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double result;
		System.out.println("Enter First Number:");
		double a=sc.nextDouble();
		System.out.println("Enter Second Number:");
		double b=sc.nextDouble();

		System.out.println("Enter 1 for Adition:");
		System.out.println("Enter 2 for Substraction :");
		System.out.println("Enter 3 for Multiplication:");
		System.out.println("Enter 4 for divison:");
		System.out.println("Choose number(1 - 4):");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			result=a+b;
			System.out.println("Adition of two numbers :" +result);
			break;

		case 2:
			result=a-b;
			System.out.println("Substraction of two numbers :" +result);
			break;

		case 3:
			result=a*b;
			System.out.println("Multiplication of two numbers :" +result);
			break;

		case 4:
		 	result=a/b;
			System.out.println("divison of two numbers :" +result);
			break;

		default:
			System.out.println("Invalid Input!!");
			break;	
		}
	}
}