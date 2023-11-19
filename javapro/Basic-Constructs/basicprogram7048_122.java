public class basicprogram7048_122 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        int wordCount = countWords(input);
        System.out.println("The number of words in the string is: " + wordCount);
    }

    public static int countWords(String str) {
        int wordCount = 0;

        boolean word = false;
        int i = 0;

        while (i < str.length()) {
            if (Character.isLetter(str.charAt(i))) {
                wordCount++;
                word = true;
            } else if (word) {
                wordCount++;
                word = false;
            }
            i++;
        }
        return wordCount;
    }
}