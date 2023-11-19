import java.lang.*;
class D {
static String getString(char x) {
	String s = String.valueOf(x);
	return s;
}
static boolean solve(String s1, String s2) {
	String a = getString(s1.charAt(0)), 
		b = getString(s2.charAt(0));

	for (int i = 1; i < s1.length(); i++)
		if (s1.charAt(i) != s1.charAt(i - 1)){
			a += getString(s1.charAt(i));
		}
	for (int i = 1; i < s2.length(); i++)
		if (s2.charAt(i) != s2.charAt(i - 1)){
			b += getString(s2.charAt(i));
		}
	if (a.equals(b))
		return true;

	return false;
}
public static void main(String[] args) {
	String s1 = "hello", s2 = "hello";
	if (solve(s1, s2))
		System.out.print("Yes");
	else
		System.out.print("No");
}
}

