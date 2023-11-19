//WOP to find the factorial value of any number entered through the keyboard.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FactorialCal{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a number to find its factorial: ");
            int num = Integer.parseInt(reader.readLine());

            // Check if the input is non-negative
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long result = calculateFactorial(num);
                System.out.println("The factorial of " + num + " is " + result);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
