import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class prog9 {
    public static void main(String[] args) {
        // Replace "your_file_path.txt" with the path to your text file
        String filePath = "abc.txt";

        try{

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            int character;
            
            // Read and display each character until the end of the file
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}