import java.util.Scanner;

public class StringDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of parts (N): ");
        int numberOfParts = scanner.nextInt();

        if (numberOfParts > 0) {
            divideString(inputString, numberOfParts);
        } else {
            System.out.println("Please enter a valid number of parts (N > 0).");
        }

        scanner.close();
    }

    private static void divideString(String inputString, int numberOfParts) {
        int length = inputString.length();
        int partLength = length / numberOfParts;

        System.out.println("Dividing the string into " + numberOfParts + " equal parts:");

        for (int i = 0; i < numberOfParts; i++) {
            int startIndex = i * partLength;
            int endIndex = (i == numberOfParts - 1) ? length : (i + 1) * partLength;

            String part = inputString.substring(startIndex, endIndex);
            System.out.println("Part " + (i + 1) + ": " + part);
        }
    }
}