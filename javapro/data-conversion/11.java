// Data conversion:- 11. How to convert string to Char.     By(7058/21)

import java.util.*;

class STC{
 public static void main(String args[]){
   
    String str="Aryan";
  
    char [] chr= new char[str.length()];
     
    for(int i=0;i<str.length();i++){
   
   chr[i]=str.charAt(i);
   
}
for (char c : chr){
 System.out.println(c);
}
}
}