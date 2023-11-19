import java.util.*;
import java.io.*;
public class p2{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of base : ");
        int b = obj.nextInt();
        System.out.println("Enter value of height : ");
        int h = obj.nextInt();
        int res = (b * h);
        System.out.println("Area of Parallelogram : "+res);
    }
}
