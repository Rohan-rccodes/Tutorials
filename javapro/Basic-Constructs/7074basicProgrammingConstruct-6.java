// Swapping two variables
import java.util.Scanner;
class Bpc6{
    void swap(int f,int s){
        System.out.println("After Swapping both variables ");
        f=f+s;
        s=f-s;
        f=f-s;
        System.out.println("First Number : "+f);
        System.out.println("Second Number : "+s);
    }
}
class b{
    public static void main(String str[]){
    Bpc6 obj = new Bpc6();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first Number : ");
    int f=sc.nextInt();
    System.out.println("Enter the Second Number : ");
   int s=sc.nextInt(); 
   obj.swap(f,s);

}
}