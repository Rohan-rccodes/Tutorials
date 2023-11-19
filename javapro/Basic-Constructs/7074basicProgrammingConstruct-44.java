// Factorial of a Number
import java.util.Scanner;
class Bpc44{
    int fact(int x){
        if(x==0){
            return 1;
        }
         return x*(fact(x-1));
    }
}

class b{
    public static void main(String str[]){
    Bpc44 obj=new Bpc44();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int a=sc.nextInt();
    System.out.println("Factorial of the Number is : "+ obj.fact(a));
}
}