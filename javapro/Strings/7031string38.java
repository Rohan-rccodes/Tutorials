import java.util.Scanner;

class stringvv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                output += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                output += Character.toLowerCase(c);
            } else {
                output += c;
            }
        }
        System.out.println("Output: " + output);
    }
}