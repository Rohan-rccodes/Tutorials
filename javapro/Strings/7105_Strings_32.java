import java.lang.*; 
class A{ 
public static String insertString( String x, String y,int i) {
String result = new String(); 
for (int j = 0; j < x.length(); j++) { 
		result += x.charAt(j); 
		if (j == i){ 
			result += y; 
			} 
		} 
	return result; }
public static void main(String[] args){ 
		String x = "hellohello"; 
		String y = "world"; 
		int i = 4; 
		System.out.println("First string " + x); 
		System.out.println("Second string " + y); 
		System.out.println("Result "+ insertString(x,y,i)); 
	} 
} 
