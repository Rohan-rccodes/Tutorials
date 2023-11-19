class Program102{
    public static void main(String args[])throws ClassNotFoundException{
        String names[] = {"Sourabh", "Jatin", "Jaspreet", "Rishav", "Yaman"};
        java.util.Arrays.sort(names); 
        System.out.println("Names in alphabetical order : ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);            
        }
    }
}