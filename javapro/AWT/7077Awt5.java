//create  a simple AWT application  that displays a TextField with Custom manager.
class awt{
	public static void main(String[] gfdsafgvsds){
        java.awt.Frame f = new java.awt.Frame();
        java.awt.TextField t = new java.awt.TextField("Vipin");
        f.setLayout(null);
        t.setBounds(30,100,150,30);
		f.setSize(100,200);
		f.setVisible(true);
		f.add(t);
	}
}
