class Test {
    public static void main(String args[]) {

        String line = "hello world how are you";

        int count = 1;

        for (int i = 0; i < line.length(); i++) {
            // System.out.println(line.charAt(i));

            if (line.charAt(i) == ' ')
                count++;
        }
        System.out.println("number of word " + count);
    }
}
