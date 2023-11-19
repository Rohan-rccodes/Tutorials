class GetCube
{
	GetCube()
	{
		System.out.println("\nObject is created");
	}
	public static void main(String arr[])
	{
		long  number;
		System.out.print("\nEnter the number :- ");
		java.util.Scanner s1 =new java.util.Scanner(System.in);
		number =s1.nextLong();
		number=number*number*number;
		System.out.print("the cube of the given number will be "+number);
			
	}
}