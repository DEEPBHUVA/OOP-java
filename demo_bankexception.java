import java.util.Scanner;
public class demo_bankexception{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=6000;
		System.out.println("Enter your emount:");
		int withdraw=sc.nextInt();
		try{
			if(balance<withdraw){
				throw new Exception("invaild balance!!");
				
			}
			else{
				balance=balance-withdraw;
				System.out.println(balance);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}