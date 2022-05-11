//Define class for Complex number with real and imaginary as data 
//members. Create its contructor, overload the constructors. Also define 
//addition method to add two complex objects.


package class_obj_method;
//import java.util.Scanner;
class complex{
		double real;
		double imagenary​;
		//Scanner sc=new Scanner(System.in);
		public complex()
		{
			this.real=0;
			this.imagenary​=0;
		}
		public complex(double real, double imagenary​) {
			this.real=real;
			this.imagenary​=imagenary​;
		}
		public void add(complex c2) {
			 double tempr=this.real+c2.real;
			 double tempi=this.imagenary​+c2.imagenary​;
			 
			 System.out.println(tempr+"+" + "i"+tempi);
		}
//		public void displayno() {
//			System.out.println(real+"+" + "i"+imagenary​);
//		}
}
	public class complexdemo {
	public static void main(String[] args) {
		complex c1=new complex(10,10);
		complex c2=new complex(8,5);
		c1.add(c2);
	}
}
