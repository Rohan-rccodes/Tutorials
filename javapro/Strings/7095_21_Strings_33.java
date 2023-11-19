import java.io.*;
import java.util.*;
class Strings_33 {
    static void traverseString(String str)
    {
        for (int i = 0; i < str.length(); i++) {
 
            System.out.print(str.charAt(i) + " ");
        }
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        String str = "Hello world";
 
        // Calling the Method 1
        traverseString(str);
    }
}