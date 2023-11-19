import java.util.Scanner;

class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        System.out.print("Enter the starting position (index starting from 0): ");
        int startPosition = scanner.nextInt();

        
        System.out.print("Enter the ending position (index starting from 0): ");
        int endPosition = scanner.nextInt();

        
        if (startPosition < 0 || endPosition >= inputString.length() || startPosition > endPosition) {
            System.out.println("Invalid positions. Please enter valid positions.");
        }

        
        String resultSubstring = getSubstring(inputString, startPosition, endPosition);

        
        System.out.println("Substring between positions " + startPosition + " and " + endPosition + ": " + resultSubstring);

        scanner.close();
    }

    
    private static String getSubstring(String inputString, int startPosition, int endPosition) {
        return inputString.substring(startPosition, endPosition + 1);
    }
}