import java.util.Scanner;
	
public class prime_number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number prime or not:");
	double num=sc.nextDouble();
	int count=0;
	for (int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}
	if(count==1)
		System.out.println("Entered number is not prime");
	else
		System.out.println("Entered number is prime");
}
}
