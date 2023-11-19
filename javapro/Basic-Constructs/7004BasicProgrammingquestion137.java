public class RomanToInteger
 {

   	 public static void main(String[] args)
	 {
        	String romanNumeral;
		java.util.Scanner s1=new java.util.Scanner(System.in);
		romanNumeral=s1.nextLine(); 
        	int integerValue = convertRomanToInt(romanNumeral);
        	System.out.println(romanNumeral + " = " + integerValue);
   	 }

    	private static int convertRomanToInt(String romanNumeral) 
	{
        Map<Character, Integer> romanNumeralValues = new HashMap<>();
        romanNumeralValues.put('I', 1);
        romanNumeralValues.put('V', 5);
        romanNumeralValues.put('X', 10);
        romanNumeralValues.put('L', 50);
        romanNumeralValues.put('C', 100);
        romanNumeralValues.put('D', 500);
        romanNumeralValues.put('M', 1000);
        int integerValue = 0;
        for (int i = 0; i < romanNumeral.length(); i++)
	 {
            int currentRomanNumeralValue = romanNumeralValues.get(romanNumeral.charAt(i));

            if (i + 1 < romanNumeral.length() && currentRomanNumeralValue < romanNumeralValues.get(romanNumeral.charAt(i + 1)))
	    {
                integerValue -= currentRomanNumeralValue;
            }
	  else {
                integerValue += currentRomanNumeralValue;
            }
        }

        return integerValue;
    }
}