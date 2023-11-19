import java.util.Scanner;

class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        if (!isValidBinary(binaryInput)) {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
            return;
        }

        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal equivalent: " + decimalResult);
    }

    private static boolean isValidBinary(String binaryInput) {
        return binaryInput.matches("[01]+");
    }

    private static int binaryToDecimal(String binaryInput) {
        int decimalResult = 0;
        int binaryLength = binaryInput.length();

        for (int i = binaryLength - 1; i >= 0; i--) {
            int digit = binaryInput.charAt(i) - '0';
            decimalResult += digit * Math.pow(2, binaryLength - 1 - i);
        }

        return decimalResult;
    }
}

