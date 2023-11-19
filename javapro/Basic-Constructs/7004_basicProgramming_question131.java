class a
{
	public static void hcf(int a ,int b )
	{
		int i;
		i=a>b?a:b;
		for(;i>0;--i)
		{
			if(a%i==0&&b%i==0)
			{
				System.out.print("\nthe hcf of "+a+" and "+b+" is :- "+i);
					break;
			}
		}
		
	}
	public static void lcm(int a,int b)
	{
		int i;
		for(i=(a<b?b:a);i<=(a*b);i=i+(a<b?b:a))
		{
			if(i%a==0&&i%b==0)
			{
			 break;
			}
		}
		if(i%a==0&&i%b==0)
		{
			System.out.print("\nthe lcm of "+a+" and "+b+" is :- "+i);
		}
	}
	public static void main(String arr[])
	{
		int x,y;	
		java.util.Scanner s1=new java.util.Scanner(System.in);
		System.out.print("\nEnter 1st number :- ");
		x=s1.nextInt();
		System.out.print("\nEnter 2nd number :- ");
		y=s1.nextInt();
		hcf(x,y);
		lcm(x,y);
	}
}

		