class oneHundredEighteen {
    public static void main(String[] args) throws java.io.IOException {
        int num = 0, first = 0, second = 1, next = 0;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        try {
            num = java.lang.Integer.parseInt(reader.readLine());
            System.out.println("Fibonnaci series of " + num + " terms is ");
            for (int i = 1; i <= num; i++) {
                if(i==1) System.out.print(first + " ");
                else if(i==2) System.out.print(second + " ");
                else{
                    next = first + second;
                    System.out.print(next + " ");
                    first = second;
                    second = next;
                }
            }
            System.out.println();
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}