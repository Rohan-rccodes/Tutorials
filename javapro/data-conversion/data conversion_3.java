public class StringToLongExample {
    public static void main(String[] args) {
        // Sample String
        String numberString = "123456789";

        try {
            // Convert String to long
            long number = Long.parseLong(numberString);

            // Print the result
            System.out.println("Converted long value: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Error: Unable to parse the string as a long.");
            e.printStackTrace();
        }
    }
}
