
//Create a class, entering the command line arguments from the user and show all the arguments as output.

class CommandLineArgumentsExample {
    public static void main(String[] args) {
      
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments provided:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
