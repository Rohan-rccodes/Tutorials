import java.util.Scanner;

public class Program126 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the base of the triangle: ");
    int b = sc.nextInt();

    System.out.print("Enter the height of the triangle: ");
    int h = sc.nextInt();

    float area = (b * h) / 2;

    System.out.println("The area of the triangle is " + area);
  }
}