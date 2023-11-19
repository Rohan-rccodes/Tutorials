import java.lang.StringBuffer;

public class strings7048_49 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");
        System.out.println(reverse(sb));
    }

    public static StringBuffer reverse(StringBuffer sb) {
        if (sb == null || sb.length() == 0) {
            return sb;
        }
        int start = 0;
        int end = sb.length() - 1;
        char temp;
        while (start < end) {
            temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        return sb;
    }
}