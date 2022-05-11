class ExceptionHandleUsingThrow{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			try
			{
				int a=Integer.parseInt(args[i]);
				if(a<0)
				{
					System.out.println("Please enter valid input");
				}
				else if(a%10==0)
				{
				   System.out.println("Please enter valid input");	
				}
				else if(a>1000 && a<2000)
				{
					System.out.println("Please enter valid input");
				}
				else if(a>7000)
				{
					System.out.println("Please enter valid input");
				}
				else
				{
					 sum=sum+a;	
				}
		    }
			    catch(Exception e)
			{
				System.out.println("Invalid Input");
			}
		}
		System.out.println("Sum of all your values is:"+sum);
		
	}
}