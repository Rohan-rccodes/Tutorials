         /*Count all the vowels in a string */
class String123 {
       public static void main(String[] args) {
        String inputString = "Hello, this is java programming.";
        System.out.println("Input String: " + inputString);
        
        int vowelCount = countAllVowels(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countAllVowels(String str) {
        int count = 0;
        // Convert the input string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel ('a', 'e', 'i', 'o', 'u' - both lowercase and uppercase)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}


