class Exception
{
    public static void main(String[] args)
    {
        try {
            int[] arr = new int[5];
            
            arr[10] = 50; // This statement will throw an exception

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
