package class_obj_method;
import java.util.Scanner;

public class voweldemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vowel=0;
		char ch;
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		while(!str.equals("quit"))
		{
			
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
			{
				vowel++;
			}
		}
		System.out.println("Vowels for this sentence:" + vowel);
		System.out.println("Enter sentence:");
		 str=sc.nextLine();
		}
	
	System.out.println("Total Vowels:"+vowel);
		
	}
}
