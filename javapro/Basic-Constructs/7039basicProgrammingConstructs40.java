import java.util.Scanner;
class a
{
    public static void main (String x[])
    {
     Scanner s=new Scanner(System.in);
    System.out.println("To calculate surface area of cube:");
    System.out.println("Enter the side of cube: ");
    // input value
     float side=s.nextFloat();
     float area;
     area=6*side*side;
     System.out.println("Surface area of cube:"+area);
    }
}