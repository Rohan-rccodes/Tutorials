import java.awt.Choice;
import java.awt.Frame;
class prog15{
public static void main(String args[]){
/* 
     Topic= Graphical user interface AWT
     prog.no 15.Create a simple AWT application that displays a List with Custom
     Layout.

*/
Frame f=new Frame("Custom list app");
 Choice choose =new Choice();
choose.add("Home");
choose.add("Office");
choose.add("Card");
choose.add("Tables");
choose.add("Hourse");
choose.add("Purse");
choose.add("All");
f.add(choose);
f.setSize(300,300);
f.setVisible(true);
}
}