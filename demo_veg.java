//The abstract vegetable class has three subclasses named Potato, Brinjal
//and Tomato. Write a java program that demonstrates how to establish 
//this class hierarchy. Declare one instance variable of type String that 
//indicates the color of a vegetable. Crete and display instances of these 
//objects. Override the toString() method of object to return a string with 
//the name of vegetable and its color.

package abstract_class_and_Interface;
import java.util.Scanner;

abstract class vegetable{
	public String color=" ";
	abstract void tostring();
}
class potato extends vegetable{
	void tostring() {
	System.out.println("Potato:yellow");
	}
}
class brinjal extends vegetable{
	void tostring() {
	System.out.println("Brinjal:Purple");
}
}
class tomato extends vegetable{
	void tostring() {
	System.out.println("Tomato:red");
}
}
public class demo_veg {
public static void main(String[] args) {
	vegetable v=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	String str=sc.nextLine();
	switch(str){
	case "tomato":
		v=new tomato();
		break;
		
	case "potato":
		v=new potato();
		break;
			
	case "brinjal":
		v=new brinjal();
	}
	v.tostring();
 }
}
