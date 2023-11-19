import java.util.*;
import java.io.*;
public class p4{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of radius : ");
        int r = obj.nextInt();
        int res = (4/3)* 3.14 * r * r * r;
        System.out.println("Volume of Sphere : "+res);
    }
}
