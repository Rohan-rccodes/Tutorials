// Program to Convert String to String Array
class StringToArray {
    public static void main(String[] args) {
        String inputString = "Hello, World! This is a sample string.";
        String[] stringArray = inputString.split(" ");
        
        for (String word : stringArray) {
            System.out.println(word);
        }
    }
}
