//Program to find whether the year is Leap or not.
import java.util.Scanner;
class Bpc56{
    void leap(int l){
        if(l%4==0){
             System.out.println(l+" is a Leap year.");
        }
        else{
            System.out.println(l+" is not a Leap year.");
        }
    }
}
class b{
    public static void main(String str[]){
        Bpc56 obj = new Bpc56();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Year : ");
    int l =sc.nextInt();
    obj.leap(l);
    }
}