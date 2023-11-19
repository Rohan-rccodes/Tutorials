class a 
{

    public static float roundFloat(float number, int decimalPlaces)
 {
        float factor = (float) Math.pow(10, decimalPlaces);
        number = number * factor;
        number = Math.round(number);
        number = number / factor;
        return number;
  }

    public static void main(String[] args) 
	{
        float original;
        int decimalPlaces;
	java.util.Scanner s1=new java.util.Scanner(System.in);
	System.out.print("Enter the float number :- ");
	original=s1.nextFloat();
	System.out.print("Enter the round decimal number :- ");
	decimalPlaces=s1.nextInt();
        float roundedNumber = roundFloat(original, decimalPlaces);
        System.out.println("Original number: " + original);
        System.out.println("Rounded number to " + decimalPlaces + " decimal places: " + roundedNumber);
    }
}