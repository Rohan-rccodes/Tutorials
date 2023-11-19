import java.util.*;
import java.io.*;
public class p5{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of radius : ");
        int r = obj.nextInt();
        System.out.println("Enter value of height : ");
        int h = obj.nextInt();
        int res = 3.14 * h * r * r;
        System.out.println("Volume of Cylinder : "+res);
    }
}
