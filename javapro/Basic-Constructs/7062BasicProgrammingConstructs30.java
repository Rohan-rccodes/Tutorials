import java.util.Scanner;
class area
{
    public static void main(String st[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the side of the triangle: ");
       double side =s.nextDouble();
        double ar= java.lang.Math.sqrt(3)/4*side*side;
        System.out.println("Area of the triangle is "+ ar);
    }
}