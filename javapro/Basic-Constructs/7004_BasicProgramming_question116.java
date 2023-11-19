class a1
{
	a1()
	{
		System.out.println("\nObject is created");
	}
	public static void main(String brr[])
	{
		int count=0,totalsum=0,sumcube=1,demo,cube,number;
		for(int j=1;j<=600;j++)
		{
			number=j;
			demo=number;
			while(demo>0)
			{
				count++;
				demo=demo/10;
			}
			demo=number;
			while(demo>0)
			{
				cube=demo%10;
				for(int i=1;i<=count;i++)
				{
					sumcube=sumcube*cube;
				} 
				totalsum=totalsum+sumcube;
				demo=demo/10;
				sumcube=1;
			}
			if(number==totalsum)
			{
				System.out.print("\nthe "+number+" will be armstrom number ");
			}
				totalsum=0;
				count=0;
		}
	
	}
		
}
