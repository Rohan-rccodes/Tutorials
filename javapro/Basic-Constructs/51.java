import java.util.Scanner;

//Java Program To Calculate Power Of Number

  class kamal7019java51 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base number: ");
    int base = input.nextInt();
    System.out.print("Enter the exponent: ");
    int exponent = input.nextInt();
    long result = 1;
    while (exponent != 0) {
      result *= base;
      --exponent;
    }
    System.out.println(base + "^" + exponent + " = " + result);
  }
}