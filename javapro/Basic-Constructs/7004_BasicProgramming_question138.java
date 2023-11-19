import java.lang.Math;

 class Absolute
{
    public static void main(String[] args) 
	{
	java.util.Scanner s1=new java.util.Scanner(System.in);
        float number;
	System.out.print("\nEnter the float number :- ");
	number =s1.nextFloat();
        float absoluteValue = Math.abs(number);
        System.out.println("The absolute value of " + number + " is: " + absoluteValue);
    }
}