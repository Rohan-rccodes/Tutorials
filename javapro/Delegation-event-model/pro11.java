import java.awt.*;
public class pro11 extends Frame 

{
    List awtList;
	
	public pro11() {
		
	    setSize(500, 250);
	    setLocation(100,100); 
        setVisible(true);
	       
	    awtList = new List(5, true);
	    awtList.add("Apple");
	    awtList.add("Orange");
	    awtList.add("Banana");
	    awtList.add("Grapes");
	    awtList.add("Pine Apple");
	    awtList.add("Strawberry");
	    awtList.add("Jack Fruit");
	    awtList.add("Papaya");
	    awtList.add("Water Melon");
	    awtList.add("Mango");
	    
      setLayout(new FlowLayout());
      add(awtList);
    
	}
    public static void main(String s[]){
new pro11();
}

}