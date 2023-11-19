import java.util.Scanner;

class average {
    public static void main(String[] a) {
        Scanner s=new Scanner(System.in);
        double sum=0;
        System.out.println("Enter Five Numbers: ");

        for(int i=0;i<5;i++){
            double number = s.nextDouble();
            sum+=number;
        }
        double average=sum/5;
        System.out.println("The average of the five numbers is : "+average);
    }
}