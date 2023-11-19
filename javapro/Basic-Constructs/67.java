import java.util.Scanner;

class studentgrade {
    public static void main(String[] a) {
        System.out.println("Enter Student's score between 0 to 100 :  ");
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();

        char grade;

        if(marks>=90){
            grade='A';
        }else if(marks>=80){
            grade='B';
        }else if(marks>=70){
            grade='C';
        }else if(marks>=60){
            grade='D';
        }else if(marks>=50){
            grade='E';
        }else{
            grade='F';
        }
        System.out.println("The Student's grade is : "+grade);
    }
}
