import java.time.LocalTime;

class SystemTime {
    public static void main(String[] args) {
        // Get the current system time
        LocalTime currentTime = LocalTime.now();

        // Display the system time
        System.out.println("System Time: " + currentTime);
    }
}