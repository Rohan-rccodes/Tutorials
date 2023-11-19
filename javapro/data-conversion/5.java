class StringToFloatExample {
    public static void main(String[] args) {
        // Example String containing a floating-point number
        String floatString = "3.14";

        // Convert String to float using Float.parseFloat()
        try {
            float floatValue = Float.parseFloat(floatString);
            System.out.println("Converted float value: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid float format in the input string");
            e.printStackTrace();
        }
    }
}
