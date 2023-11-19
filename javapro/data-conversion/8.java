import java.util.Scanner;
class ja{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a double number: "); 
double num = sc.nextDouble();
String str = Double.toString(num);
System.out.println("Converted String: " + str);   
    }
}