//check alphabet is a vowel or constant
import java.util.Scanner;
class checking
{
public static void main(String[] args){


Scanner check=new Scanner(System.in);
System.out.println("enter an alphabet");
String undercheck = check.next();
String undercheckLower = undercheck.toLowerCase();

if (undercheckLower.equals("a")|| undercheckLower.equals("e")||undercheckLower.equals("i")||undercheckLower.equals("u")||undercheckLower.equals("o"))
System.out.println(undercheck + " is a vowel.");
else
System.out.println("it is a constant");
}
}