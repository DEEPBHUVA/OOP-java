package classes_inheritance;
class animal{
	String color = "White";
}
class dog extends animal{
	String color="Black";

void printcolor() {
	System.out.println(color);
	System.out.println(super.color);
	}
}
public class testsuper {
public static void main(String[] args) {
	dog d=new dog();
	d.printcolor();
}
}
