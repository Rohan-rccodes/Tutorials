import java.util.Date;
import java.text.SimpleDateFormat;
class DateToString{
public static void main(String a[])
{
Date date=new Date();
System.out.println(date);
SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String str=s.format(date);
System.out.println(str);
}
}