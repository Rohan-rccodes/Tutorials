//Write a Java program to print Fibonacci series of n terms where n is input by user using loop.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FibonacciSeries {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the number of terms for Fibonacci series: ");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("Fibonacci series up to " + n + " terms:");

            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
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

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
