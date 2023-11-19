class CharacterFinder {
    public static void main(String[] args) {
        String input = "Hello World";
        char maxChar = findMaxCharacter(input);
        char minChar = findMinCharacter(input);
        
        System.out.println("Maximum character: " + maxChar);
        System.out.println("Minimum character: " + minChar);
    }
    
    public static char findMaxCharacter(String input) {
        char maxChar = input.charAt(0);
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) > maxChar) {
                maxChar = input.charAt(i);
            }
        }
        
        return maxChar;
    }
    
    public static char findMinCharacter(String input) {
        char minChar = input.charAt(0);
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) < minChar) {
                minChar = input.charAt(i);
            }
        }
        
        return minChar;
    }
}