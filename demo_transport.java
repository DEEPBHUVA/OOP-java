package abstract_class_and_Interface;
interface transport{
	public void deliver();
}
abstract class animal{
	String name;
	void deliver(){
	}
}
class tiger extends animal{
	void deliver() {
		System.out.println("Tiger can not use to deliver");
	}
}
class camel extends animal implements transport{
	public void deliver() {
		System.out.println("camel can use for deliver in dezert");
	}
}
class deer extends animal{
	void deliver() {
		System.out.println("deer can not use to deliver");
	}
}
class donkey extends animal implements transport{
	public void deliver() {
		System.out.println("donkey can use to deliver in village");
	}
}
public class demo_transport {
	public static void main(String[] args) {
		tiger ti=new tiger();
		ti.deliver();
		camel ca=new camel();
		ca.deliver();
		deer de=new deer();
		de.deliver();
		donkey don=new donkey();
		don.deliver();
		
}
}