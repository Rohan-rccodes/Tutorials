class CharacterPrinter {
     static void printCharactersBetween(char startChar, char endChar) {
        if (startChar > endChar) {
            char temp = startChar;
            startChar = endChar;
            endChar = temp;
        }

        for (char ch = startChar; ch < endChar; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(endChar); 
    }

    public static void main(String[] args) {
        char startChar = 'A';
        char endChar = 'F';

        System.out.println("Characters between " + startChar + " and " + endChar + ":");
        printCharactersBetween(startChar, endChar);
    }
}
