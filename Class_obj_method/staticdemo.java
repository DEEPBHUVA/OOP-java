package class_obj_method;
class demo{
	static int count=0;
	demo(){
		count++;
		System.out.println(count);
	}
}
public class staticdemo{
	public static void main(String[] args) {
		demo s=new demo();
		demo s1=new demo();
		demo s2=new demo();
}
}

