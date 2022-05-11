package array_and_string;
public class array_avg {
	public static void main(String[] args) {
		int value[] = {45,56,89,78};
		int sum=0;
		for(int fg:value)
		{
			sum=sum+fg;
		}
		System.out.println("The value of the sum:" +sum);
		System.out.println("The Average of value:" +sum/4);
	}
}
