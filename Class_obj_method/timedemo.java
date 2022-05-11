//Define Time class with constructor to initialize hour and minute. Also 
//define addition method to add two time objects.

package class_obj_method;
class time{
	int hh;
	int mm;
	
	void setdata(int x,int y) {
		hh=x;
		mm=y;
	}
	void dislaydata() {
		System.out.println("Hours:" +hh);
		System.out.println("Minutes:" +mm);
	}
	time add(time a,time b) {
		time  temp =new time();
		
		temp.mm=this.mm+b.mm;
		temp.hh=this.hh+b.hh+(temp.mm/60);
		temp.mm=temp.mm%60;
	return temp;
	}
}
public class timedemo {
	public static void main(String[] args) {
		time t1=new time();
		t1.setdata(5, 35);
		time t2=new time();
		t2.setdata(6, 45);
		//------------//
		time t3=new time();
		t3=t1.add(t1, t2);
		
		t1.dislaydata();
		t2.dislaydata();
		t3.dislaydata();
	}
}
