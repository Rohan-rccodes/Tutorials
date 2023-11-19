
            import java.util.Scanner;
            public class basic52_7024 {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    // Prompt the user to enter three numbers
                    System.out.println("Enter three numbers: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int num3 = scanner.nextInt();
                    int greatestNumber = num1;
                    // Check if num2 is greater than the greatest number variable
                    if (num2 > greatestNumber) {
                        greatestNumber = num2;
                    }
                    // Check if num3 is greater than the greatest number variable
                    if (num3 > greatestNumber) {
                        greatestNumber = num3;
                    }
                    // Print the greatest number to the console
                    System.out.println("The greatest number is: " + greatestNumber);
                }
            }
            
        