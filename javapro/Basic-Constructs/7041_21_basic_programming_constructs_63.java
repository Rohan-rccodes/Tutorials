class basic_programming_constructs_63 {
    public static void main(String[] args) {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a number: ");
            double number = Double.parseDouble(input.readLine());
            StringBuffer msg = new StringBuffer("zero");

            if (number > 0) {
                msg.replace(0, msg.length(), "positive");
            } else if (number < 0) {
                msg.replace(0, msg.length(), "negative"); 
            }

            System.out.println("The number is " + msg);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid numeric value.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}