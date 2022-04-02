import java.util.Scanner;

public class Patteran3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre rows for Patteran:");
		int n=sc.nextInt();

		for (int i=1;i<=n ;i++ ) {
			for (int j=n-1;j>=i ;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				//1 Space for Triangle//
				System.out.print(" *");	
			}
			System.out.println(" ");		
		}
	}
}

