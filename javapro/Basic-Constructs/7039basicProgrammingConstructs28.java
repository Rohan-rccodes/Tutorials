import java.util.Scanner;
class a
{
    public static void main (String x[])
    {
       Scanner l=new Scanner(System.in);
       Scanner b=new Scanner(System.in);
       // inpu length and breadth by user
       System.out.println("To calculate the area of rectangle:");
       System.out.print("Enter  length: ");
       float length=l.nextFloat();
       System.out.print("Enter breadth: ");
       float breadth=b.nextFloat();

       float area;
       area=2*length+2*breadth;
       System.out.println("Area of Rectangle:"+area);
    }
}