package demoapp;

import java.util.Scanner;
class account
{
	int accountNo;
	String username;
	String email;
	String accounttype;
	int accountbalance;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Bank-account no:");
		accountNo= sc.nextInt();
		System.out.println("Enter your Username:");
		username= sc.next();
		System.out.println("Enter your Email:");
		email =sc.next();
		System.out.println("Enter your Account type:");
		accounttype =sc.next();
		System.out.println("Enter your Account Balance:");
		accountbalance= sc.nextInt();
	}
		void displaydata()
	{
			System.out.println("Account no:" +accountNo);
			System.out.println("Username" +username);
			System.out.println("Email:" +email);
			System.out.println("Accounttype" +accounttype);
			System.out.println("Account-Balance" +accountbalance);
	}
	
}
public class Bank_account {
		public static void main(String[] args) {
			account ac=new account();
					ac.getdata();
					ac.displaydata();
		}
}
