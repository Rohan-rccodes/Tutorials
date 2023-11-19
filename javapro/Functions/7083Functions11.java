import java.util.Scanner;
 class check_consecutive { 
 public static void main(String s[] )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("The three given numbers are consecutive(true or false) : ") ;
        System.out.println(test(x,y,z));
        }

 public static boolean test(int x, int y, int z){
    int max_num = Math.max(x, Math.max(y, z));
    int min_num = Math.min(x, Math.min(y, z));
    int middle_num = x+y+z - max_num - min_num;
    return (max_num - middle_num) == 1 && (middle_num - min_num == 1);
  }
} 