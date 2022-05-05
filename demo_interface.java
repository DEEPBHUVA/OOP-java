package abstract_class_and_Interface;
interface A{
	String astr="Astr";
	void displayA();
}
interface A1 extends A{
	String astr="A1str";
	void displayA1();
}
interface A2 extends A{
	String astr="A2str";
	void displayA2();
}
interface A12 extends A1,A2{
	String astr="A12str";
	void displayA12();
}
class B implements A12{
	public void displayA() {
		System.out.println(A.astr);
	}
	public void displayA1() {
		System.out.println(A1.astr);
	}
	public void displayA2() {
		System.out.println(A2.astr);
	}
	public void displayA12() {
		System.out.println(A12.astr);
	}
}
public class demo_interface {
public static void main(String[] args) {
	A a=new B();
	a.displayA();
	
	A1 a1=new B();
	a1.displayA1();
	
	A2 a2=new B();
	a2.displayA2();
	
	A12 a12=new B();
	a12.displayA12();
	
}
}
