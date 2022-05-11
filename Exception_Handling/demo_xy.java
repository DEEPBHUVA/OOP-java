public class demo_xy {
	public static void main(String args[]) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a*b;
			System.out.println("Answer:"+c);
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("please vaild input!!");
		}
	}
}