class Add{
    public static void main(String[] args) {
        // Using concat method
        String originalString = "Hello";
        String newString1 = originalString.concat(" World!");

        // Using + operator
        String newString2 = originalString + " Java!";

        // Print the modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String 1: " + newString1);
        System.out.println("Modified String 2: " + newString2);
    }
}
