class number
{
    public static void main(String arg[])throws java.io.IOException
    {
        double a;
        int b;
        java.io.BufferedReader input = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
        System.out.println("Enter a number to check whether it is integer or not ");
        a= Double.parseDouble(input.readLine());
        b=(int)a;
        if(a-b!=0)
        System.out.println(a+" it is not an integer");
        else
        System.out.println(a+" it is a integer");
    }
}