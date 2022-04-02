import java.util.Scanner;

public class Patteran8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Entre rows for Patteran(65 to 70):");
		int n=sc.nextInt();
		
		for (int i=1;i<=n ;i++ ) {
			for (int j=65;j<=i ;j++) {
				System.out.print((char)j+" ");
			}
			System.out.println(" ");	
		}
	}
}