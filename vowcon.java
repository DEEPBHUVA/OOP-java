package array_and_string;
import java.util.Scanner;
public class vowcon {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String to cheak how many vowels,consonent,and space:");
	String str = sc.nextLine();
	int vowel=0,conso=0,space=0;
	for(int i=0;i<str.length();i++)
			{
		if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || 
				str.charAt(i)=='U' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
				str.charAt(i)=='o' || str.charAt(i)=='u') {
			vowel++;
			
			}
		else if(str.charAt(i)==' ') {
			space++;
		}
		else {
			conso++;
		}
	}
	System.out.println("vowels = "+vowel);
	System.out.println("consonent = "+conso);
	System.out.println("space = "+space);
}
}
