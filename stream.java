package array_and_string;

public class stream {
public static void main(String[] args) {
	 String a="stream";
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
