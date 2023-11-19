interface Resizable {
  
    void resizeWidth(int width);

  void resizeHeight(int height);
}

class Rectangle implements Resizable {
   
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

   
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}


 class Final_size {
    public static void main(String s[] ) {
       
        Rectangle r = new Rectangle(50, 30);

        r.printSize();

      
        r.resizeWidth(80);
        r.resizeHeight(40);
        r.printSize();
    }
}