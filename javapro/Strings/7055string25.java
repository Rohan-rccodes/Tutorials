// Program to find the duplicate words in a string
class FindDuplicateWords {
    public static void main(String[] args) {
        String inputString = "This is a sample string and this is a sample example.";
        String[] words = inputString.split(" ");
        int[] wordCount = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (!words[i].isEmpty()) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        wordCount[i]++;
                    }
                }
            }
        }

        // Print duplicate words
        for (int i = 0; i < words.length; i++) {
            if (wordCount[i] > 0) {
                System.out.println("Word: " + words[i] + ", Count: " + (wordCount[i] + 1));
                wordCount[i] = 0; // Reset the count to avoid duplicate output
            }
        }
    }
}
