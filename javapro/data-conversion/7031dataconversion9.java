import java.text.SimpleDateFormat;
import java.util.Date;

public class convert {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = formatter.format(date);
        System.out.println("Date converted to string: " + strDate);
    }
}
