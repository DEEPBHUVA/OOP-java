import java.util.Scanner;

public class Revears{
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter number for Revears:");
		int n=ab.nextInt();
		int sum=0,rem,last;
		for (;n>0;) 
		{
			last=n%10;
			sum=sum*10+last;
			n=n/10;
		}
			System.out.println("Revears:" +sum);
	}
}