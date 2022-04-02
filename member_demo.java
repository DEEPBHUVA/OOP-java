//Create a class named 'Member' having the following members:
//1-Name
//2-Age
//3-phone number
//4-Address
//5-Salary
//It also has a method named 'printSalary' which prints the salary of the 
//members.
//Two classes 'Employee' and Manager' inherits the 'Member' class. The 
//'Employee' and 'Manager' classes have data members 'specialization' 
//and 'department' respectively. Now assign name, age, phone number 
//address and salary to an employee and a manager by making an object 
//of both of these classes and print the same along with specialization and 
//department respectively.


package classes_inheritance;

class member{
	String name;
	int age;
	String Phone_number;
	String address;
	double salary;

	void salary() {
		System.out.println("Salary:" +salary);
	}
}
	class employee extends member{
		String specialization;
		employee(String name,int age,String Phone_number,String address,double salary,String specialization){
			this.name=name;
			this.age=age;
			this.Phone_number=Phone_number;
			this.address=address;
			this.salary=salary;
			this.specialization=specialization;
	}
		void displyemployeedata() {
			System.out.println("====Details of employee====");
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Phone number:"+Phone_number);
			System.out.println("Address:"+address);
			System.out.println("Salary:"+salary);
			System.out.println("Specialization:"+specialization);
			System.out.println();
		}
		class manager extends member{
			String departement;
			manager(String name,int age,String Phone_number,String address,double salary,String departement){
				this.name=name;
				this.age=age;
				this.Phone_number=Phone_number;
				this.address=address;
				this.salary=salary;
				this.departement=departement;
		}
			void displymanagerdata() {
				System.out.println("====Details of manager====");
				System.out.println("Name:"+name);
				System.out.println("Age:"+age);
				System.out.println("Phone number:"+Phone_number);
				System.out.println("Address:"+address);
				System.out.println("Salary:"+salary);
				System.out.println("​department"+departement);
				System.out.println();
			}
		}
	}
public class member_demo {
public static void main(String[] args) {
	employee sc=new employee("Deep_bhuva", 18,"8156065294","Rajkot",50000,"java_developer");
	//manager s=new manager("pratik",45,"1234567890","Rajkot",100000,"Web_developer");
	
	sc.displyemployeedata();
}
}
