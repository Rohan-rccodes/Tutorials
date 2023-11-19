import java.util.Scanner;

class checknumber {
    public static void main(String[] a) {
        System.out.println("Enter a Number : ");
        Scanner s=new Scanner(System.in);
        double number=s.nextDouble();

        if(number>0){
            System.out.println("The Number is Positive.");
        }
        else if(number<0){
            System.out.println("The Number is Negative.");
        }
        else{
            System.out.println("The Number is Zero.");
        }
    }
}
