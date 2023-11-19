/*Write a Java Program to accept number of week’s day (1-7) and print name of the day */

            import java.util.Scanner;
    
            public class basic55_7024 {
            
                public static void main(String[] args) {
            
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter the number of the week's day
                    System.out.println("Enter the number of the week's day (1 to 7): ");
                    int weekDayNumber = scanner.nextInt();
            
                    // Declare a variable to store the name of the week day
                    String weekDayName;
            
                    // Use a switch statement to determine the name of the week day
                    switch (weekDayNumber) {
                        case 1:
                            weekDayName = "Monday";
                            break;
                        case 2:
                            weekDayName = "Tuesday";
                            break;
                        case 3:
                            weekDayName = "Wednesday";
                            break;
                        case 4:
                            weekDayName = "Thursday";
                            break;
                        case 5:
                            weekDayName = "Friday";
                            break;
                        case 6:
                            weekDayName = "Saturday";
                            break;
                        case 7:
                            weekDayName = "Sunday";
                            break;
                        default:
                            weekDayName = "Invalid week day number.";
                            break;
                    }
            
                    // Print the name of the week day to the console
                    System.out.println(" Name of that week day is: " + weekDayName);
                }
            }
            
        