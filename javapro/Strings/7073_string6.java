class Insert {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello World!");

        // Insert a string at a specific position
        stringBuffer.insert(6, "Java ");

        // Print the modified string
        System.out.println("Modified String: " + stringBuffer.toString());
    }
}
