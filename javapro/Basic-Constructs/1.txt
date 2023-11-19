public class ReverseString {
                public static String reverseString(String str) {
                    StringBuilder sb = new StringBuilder(str);
                    sb.reverse();
                    return sb.toString();
                }
            
                public static void main(String[] args) {
                    String str = "Hello, World!";
                    String reversedStr = reverseString(str);
            
                    System.out.println("The original string is: " + str);
                    System.out.println("The reversed string is: " + reversedStr);
                }
            }