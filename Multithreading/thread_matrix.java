import java.util.Scanner;
class sumarray implements Runnable{
	static int [][] a;
	static int col,row;
	static int y=0;
	public void readArray(int m,int n,Scanner sc){
		a=new int[n][m];
		col=m;
		row=n;

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}
	public void run(){
		int sum=0;
		for(int i=0;i<col;i++){
			sum=sum+a[y][i];
		}
		y++;
		System.out.print("  Thread ID:"+Thread.currentThread().getId()+"Sum:"+sum);
	}
}
public class thread_matrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row amd column for Matrix:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		sumarray a1=new sumarray();
		a1.readArray(n,m,sc);

		sumarray [] b1;
		b1=new sumarray[n];
			for (int i=0;i<n ;i++ ) {
					b1[i]=new sumarray();
					Thread t1=new Thread(b1[i]);
					t1.start();
				}	
	}
}