import java.util.Scanner;

public class persentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of MATHS-2:");
		double a=sc.nextDouble();
		System.out.println("Enter marks of DBMS-1:");
		double b=sc.nextDouble();
		System.out.println("Enter marks of OOP-1:");
		double c=sc.nextDouble();
		System.out.println("Enter marks of FOE:");
		double d=sc.nextDouble();
		System.out.println("Enter marks of EGD:");
		double e=sc.nextDouble();
		
		double sum=a+b+c+d+e;
		System.out.println("Total marks:" +sum);
		double avg=sum/5;
		System.out.println("Your parsantage:" +avg);
		
		
		if(avg<40) 
		{
			System.out.println("you are fail!!");
		}
		else if(avg>=49 || avg<=40)
		{
			System.out.println("You are in third division");
		}
		else if(avg>=59 || avg<=50)
		{
			System.out.println("You are in second division");
		}
		if(avg>=60)
		{
			System.out.println("You are in first division");
		}
		
	}

}
