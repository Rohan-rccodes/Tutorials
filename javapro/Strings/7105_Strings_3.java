class E {  
    public static void check(Object x, Object y) {  
        if (x == y) {  
            System.out.println("Both pointing to the same reference");  
        } 
        else {  
            System.out.println("Both are pointing to different reference");  
        }  
    }  
    public static void main(String[] args) {  
        String x = "hello";  
        String y = "hello";  
        System.out.println("Before Modification");  
        check(x, y);  
        System.out.println("--------------------");
        x += "world";  
        System.out.println("After Modification");  
        check(x, y);  
    }  
}  