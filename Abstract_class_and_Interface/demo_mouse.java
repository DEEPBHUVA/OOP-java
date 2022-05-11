//Create interface EventListener with performEvent() method. Create 
//MouseListener interface which inherits EventListener along with 
//mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), 
//mouseDragged() methods. Also create KeyListener interface which 
//inherits EventListener along with keyPressed(), keyReleased() methods. 
//WAP to create EventDemo class which implements MouseListener and 
//KeyListener and demonstrate all the methods of the interfaces.

package abstract_class_and_Interface;
interface  EventListener{
	void performEvent();
}
interface MouseListener extends EventListener{
	public void mouseclick();
	public void mousepressed();
	public void mousereleased();
	public void mousemoved();
	public void mousedragged();
}
interface KeyListener extends EventListener{
	public void keyPressed();
	public void keyReleased();
}
class eventdemo implements MouseListener,KeyListener{
	public void mouseclick() {
		System.out.println("mouse clicked!!");
	}
	public void mousepressed() {
		System.out.println("mouse pressed!!");
	}
	public void mousereleased() {
		System.out.println("mouse relesed!!");
	}
	public void mousemoved() {
		System.out.println("mouse moved!!");
	}
	public void mousedragged() {
		System.out.println("mouse dragged!!");
	}
	public void keyPressed() {
		System.out.println("key pressed!!");
	}
	public void keyReleased() {
		System.out.println("key relesed!!");
	}
	public void performEvent() {
		
	}
}
public class demo_mouse {
	public static void main(String[] args) {
		eventdemo ed=new eventdemo();
		ed.keyPressed();
		ed.keyReleased();
		ed.mouseclick();
		ed.mousedragged();
		ed.mousemoved();
		ed.mousepressed();
		ed.mousereleased();
	}
}
