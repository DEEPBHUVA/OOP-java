package class_obj_method;
class This{
	static int n=1;
	This(){
		this.n=n+2;
		System.out.println(this.n);
	}
}
public class Thisstatic {
	public static void main(String[] args) {
		This s=new This();
	}
}
