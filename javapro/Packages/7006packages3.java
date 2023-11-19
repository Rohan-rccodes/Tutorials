import java.util.Date;

public class CustomDate {
    private Date date;

    public CustomDate() {
        date = new Date();
    }

    public Date getCurrentDate() {
        return date;
    }

    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        Date currentDate = customDate.getCurrentDate();

        System.out.println("Current Date: " + currentDate);
    }
}
