import java.util.Scanner;

public class Patteran7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Entre rows for Patteran:");
		int n=sc.nextInt();
		
		for (int i=1;i<=n ;i++ ) {
			for (int j=1;j<=i ;j++) {
				if(j%2==0)
					System.out.print(j);
				else
					System.out.print(j);		
			}
			System.out.println(" ");	
		}
	}
}