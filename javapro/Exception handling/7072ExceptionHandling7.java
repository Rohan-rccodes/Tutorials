import java.util.Scanner;

class vowelchecker
{
public static void main(String args[])
{
try
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String str = sc.nextLine();
checkForVowels(str);
System.out.println("String Contains Vowels.");
}
catch(NoVowelsException e)
{
System.out.println("Exception : "+e.getMessage());
}
}
static void checkForVowels(String input) throws NoVowelsException
{
if(!input.matches(".*[AEIOUaeiou].*"))
{
throw new NoVowelsException("The Input string does not contains any vowels.");
}
}
}
class NoVowelsException extends Exception
{
public NoVowelsException(String message)
{
   super(message);
}
}