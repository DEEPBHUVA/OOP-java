import java.util.Scanner;

public class pelindrom_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String org,reverse= "";
	
	System.out.println("Enter string/number cheak pelindrom or not:");
	org =sc.nextLine();
	
    int length = org.length();
    for(int i=length-1;i>=0;i--) {
    	reverse =reverse + org.charAt(i);
    }
    if(org.equals(reverse))
    	System.out.println("Entered string is pelindrom");
    else
    	System.out.println("Entered string is not pelindrom");
}
}
