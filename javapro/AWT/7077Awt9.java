//Create a simple awt Application that displays a Label with CustomLayout manager.
class awt{
	public static void main(String[] gfdsafgvsds){
        java.awt.Frame f = new java.awt.Frame();
        java.awt.Label t = new java.awt.Label("Vipin");
       f.setLayout(null);
       t.setBounds(334,100,150,30);
		f.setSize(100,200);
		f.setVisible(true);
		f.add(t);
	}
}