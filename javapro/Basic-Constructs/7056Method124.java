/*Write a java method to compute the sum of all digits in an integer */
class Method124 {
    public static void main(String[] args) {
        int number = 98824;
        System.out.println("Number: " + number);
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        // Iterate through each digit of the number until it becomes zero
        while (num != 0) {
            // Extract the last digit using modulo operator
            int digit = num % 10;
            // Add the extracted digit to the sum
            sum += digit;
            // Remove the last digit from the number
            num /= 10;
        }

        return sum;
    }
}
