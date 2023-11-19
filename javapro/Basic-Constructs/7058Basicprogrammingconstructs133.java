// 133.Write a java program to reverse an integer number.  By Aryan Chugh(7058/21)

class revint {
  public static void main(String[] args) {

    int num = 6283, reverse = 0;
    
    System.out.println("Original integer is: " + num);
    while(num != 0) {
      int rim = num % 10;
      reverse = reverse * 10 + rim;

      num /= 10;
    }

    System.out.println("Reversed integer is: " + reverse);
  }
}