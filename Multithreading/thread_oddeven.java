class odd implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2!=0)
			 System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class even implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2==0)
			 System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
public class thread_oddeven{
	public static void main(String[] args) {
		odd od=new odd();
		Thread t1=new Thread(od);
		even ev=new even();
		Thread t2=new Thread(ev);
		t1.start();
		t2.start(); 
	}
}