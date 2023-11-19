/* Program to find Reverse of the string */

public class strings23_7024 {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String inputString = "Java Programs";
        String reversedString = reverseString(inputString);
        System.out.println(reversedString);
    }
}