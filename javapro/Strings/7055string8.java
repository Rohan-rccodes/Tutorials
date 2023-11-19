// Program to Add Characters to a String

class AddCharactersToString {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuffer s = new StringBuffer("Hello, ");

        // Add characters to the string
        s.append("World");

        // Print the final string
        System.out.println(s.toString()); // Output: "Hello, World!"
    }
}
