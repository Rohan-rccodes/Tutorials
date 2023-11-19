import java.util.Scanner;

 class prog5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a double
        System.out.print("Enter a double: ");

        // Check if the next input is a double
        if (scanner.hasNextDouble()) {
            // Read the double from the user
            double userInput = scanner.nextDouble();

            // Display the entered double
            System.out.println("You entered: " + userInput);

            // Check if the entered double is positive, negative, or zero
            if (userInput > 0) {
                System.out.println("The entered double is positive.");
            } else if (userInput < 0) {
                System.out.println("The entered double is negative.");
            } else {
                System.out.println("The entered double is zero.");
            }
        } else {
            // If the input is not a double, display an error message
            System.out.println("Invalid input. Please enter a valid double.");
        }

        // Close the scanner
        scanner.close();
    }
}

