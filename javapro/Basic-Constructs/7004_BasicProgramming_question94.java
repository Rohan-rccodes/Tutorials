class lowest
{
	lowest()
	{
		System.out.println("\nObject is created");
	}
	public static void main(String brr[])
	{
		java.util.Scanner s1= new java.util.Scanner(System.in);
		int first,second,i,index=-1;
		int arr[]=new int[5];
		for(i=0;i<(arr.length);i++)
		{
			System.out.print("\nEnter the "+(i+1)+" integer number :- ");
			arr[i]=s1.nextInt();
		}
		first=arr[0];
		second=arr[0];
		for(i=1;i<(arr.length);i++)
		{	
			if(first>arr[i])
			{
				second=first;
				index=i;
				first=arr[i];
			}
		}
		i=index+1;
		for(;i<(arr.length);i++)
		{
			if(second>arr[i])
			{
				second=arr[i];
			}			
		}
		System.out.print("\nthe first lowest number will be :- "+first);
		System.out.print("\nthe second lowest number will be "+second);
		
	}
}