package classes_inheritance;

class f{
	final int x=10;
}
public class demo_final {
	public static void main(String[] args) {
		f obj1=new f();
		obj1.x=20;
		System.out.println(obj1.x);
	}
}
