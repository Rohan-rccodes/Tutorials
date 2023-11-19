//Write a Java program that takes two numbers and display the product of two numbers
class ProductNums
{
	public static void main(String str[])throws java.io.IOException
	{	
		System.out.println("Computing the product of two number using BufferedReader Class");

		java.io.InputStreamReader obj = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader input = new java.io.BufferedReader(obj);
		System.out.println("enter a number : ");
		int a=Integer.parseInt(input.readLine());
		System.out.println("enter a number : ");
		int b=Integer.parseInt(input.readLine());
		System.out.println(a*b);
		
		
		System.out.println("Now we'll compute the product using Scanner Class");

		java.util.Scanner input1 = new java.util.Scanner(System.in);
		System.out.println("enter a number : ");		
		int a1=input1.nextInt();

		System.out.println("enter a number : ");
		int b1=input1.nextInt();
		System.out.println("Product of the two number is : "+ a1*b1);
		
		
		
	}
}