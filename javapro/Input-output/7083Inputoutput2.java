import java.io.*;

class Buffered_Stream
{
  public static void main ( String s[] ) throws IOException
  {
    System.out.print ( "Enter the string: " );

    BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );

    String inputString = input.readLine();

  

    System.out.println ( "Entered string is: " + inputString );
  }
}