package array_and_string;
import java.util.Scanner;
	
public class string_lnhalf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String st=new String();
	System.out.println("Enter String:");
	st=sc.nextLine();
	
	int ln=st.length();
	System.out.println("Length of the String is:" +ln);
	System.out.println("Your Half string is:" +st.substring(ln/2));
	}
}
