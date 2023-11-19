//Write a Java program that accepts three numbers and check All numbers are equal or not

class compare{
    public static void main(String st[]) throws java.io.IOException
    {
    int a,b,c;
    java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    System.out.println("Enter First number: ");
    a=Integer.parseInt(input.readLine());
     System.out.println("Enter second number: ");
    b=Integer.parseInt(input.readLine());
     System.out.println("Enter Third number: ");
    c=Integer.parseInt(input.readLine());

    if(a==b && b==c)
    System.out.println("All the numbers are equal!!");
    else
    System.out.println("Given numbers are not equal");
    }
}