class run1 implements Runnable{
	public void run(){
		for (int i=0;i<=10 ;i++ ) {
			System.out.println("Good morning");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
			}
		}
	}
}
class run2 implements Runnable{
	public void run(){
		for (int i=0;i<=10 ;i++ ) {
			System.out.println("Good afternoon");
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
			}
		}
	}
}

public class demo_thread{
	public static void main(String[] args) {
		run1 r1=new run1();
		Thread t1=new Thread(r1);
		run2 r2=new run2();
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}
}