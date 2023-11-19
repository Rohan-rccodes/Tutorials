class number
{
    public static void main(String arg[])throws java.io.IOException
    {
        int a;
        int b;
        java.io.BufferedReader input = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
        System.out.println("Enter dividend ");
        a= Integer.parseInt(input.readLine());
        System.out.println("Enter divisor ");
        b= Integer.parseInt(input.readLine());

        System.out.println("The round-up division of the given numbers is "+((a+b-1)/b));
    }
}