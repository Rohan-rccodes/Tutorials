import java.util.Scanner;

class linescount {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string (press Ctrl+Z and hit enter to end input):");

        StringBuilder inputString = new StringBuilder();
        while (s.hasNextLine()) {
            inputString.append(s.nextLine()).append("\n");
        }
        int lineCount = countLines(inputString.toString());

        System.out.println("Total number of lines: " + lineCount);
    }

    private static int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
    }
}
