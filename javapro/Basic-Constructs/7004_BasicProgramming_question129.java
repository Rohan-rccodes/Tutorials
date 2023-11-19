class a1
{
	a1()
	{
		System.out.println("\nObject is created");
	}
	public static void main(String brr[])
	{
		int number;
		java.util.Scanner s1= new java.util.Scanner(System.in);
		System.out.print("\nEnter the number ");
		number=s1.nextInt();
		int demo=number,reverse=0;
		while(demo>0)
		{
			int a=demo%10;
			reverse=reverse*10+a;
			demo=demo/10;
		}
		if(reverse==number)
		{
			System.out.print("\nthe given number "+number+" is pallindrome");
		} 
		else
		{
			System.out.print("\nthe given number "+number+" is not pallindrome");
		}
	}
		
}