//Program to count the total number of punctuation characters exists in a String

class PunctuationCount {
    public static void main(String[] args) {
        // Sample string
        String inputString = "Hello, world! This is a sample string.";

        // Count the total number of punctuation characters
        int punctuationCount = countPunctuation(inputString);

        // Display the result
        System.out.println("Total number of punctuation characters: " + punctuationCount);
    }

    // Function to count the total number of punctuation characters in a string
    static int countPunctuation(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a punctuation character
            if (isPunctuation(ch)) {
                count++;
            }
        }

        return count;
    }

    // Function to check if a character is a punctuation character
    static boolean isPunctuation(char ch) {
        return !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch);
    }
}
