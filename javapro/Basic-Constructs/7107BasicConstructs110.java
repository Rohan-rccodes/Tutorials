//Write a Java program that prompts the user to input an integer and then outputs the number with the digits reversed order.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseDigits{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter an integer: ");
            int number = Integer.parseInt(reader.readLine());

            int reversedNumber = reverseDigits(number);

            System.out.println("Reversed number: " + reversedNumber);
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

    private static int reverseDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
