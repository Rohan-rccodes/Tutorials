//enter the five numbers and find the sum and average
import java.util.Scanner;
class Calculation
{
public static void main(String[] args){
int v,w,x,y,z;
System.out.print("enter five numbers");
Scanner r=new Scanner(System.in);
v=r.nextInt();
w=r.nextInt();
x=r.nextInt();
y=r.nextInt();
z=r.nextInt();

int sum = v+w+x+y+z;
System.out.println("sum of the numbers "+ sum);

double average=sum/5.0;
System.out.println("Average of the numbers "+ average);
}
}