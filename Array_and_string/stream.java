package array_and_string;
import java.util.Scanner;

public class stream {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your string for patteran:");
	String a=sc.nextLine();
	
	String b="";
	a = a.trim();
	
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)==' ') {
			
		}
		else {
			b=b+a.charAt(i);
		}
	}
//	System.out.println(b);
	a=b;
	
	//String a="stream";
     for(int i=0;i<(a.length());i++)
     {
         for(int j=(a.length()-1);j>=i;j--)
         {
             System.out.print(" ");
         }
         for(int k=0;k<=i;k++)
         {
             System.out.print(a.charAt(k)+" ");
         }
         System.out.println("");
     }
}
}
