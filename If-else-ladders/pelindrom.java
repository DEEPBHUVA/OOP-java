import java.util.Scanner;
	
public class pelindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to cheak pelindrom or not:");
	int n=sc.nextInt();
		int sum=0,ltd,last;
		ltd=n;
		for(;n>0;)
		{
			last=n%10;
			sum=sum*10+last;
			n=n/10;
		}
		if(sum==ltd)
		{
			System.out.println("Given number is pelindrom");
		}
		else {
			System.out.println("Given number is not pelindrom");
		}
}
}
