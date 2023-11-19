class Strings_36 { 
  
                // Function to check if a 
                // word is palindrome 
                public static boolean checkPalin(String word) 
                { 
              
                    int n = word.length(); 
              
                    // making the check case 
                    // case insensitive 
                    word = word.toLowerCase(); 
              
                    // loop to check palindrome 
                    for (int i = 0; i < n; i++, n--) 
                    { 
                        if (word.charAt(i) != word.charAt(n - 1)) 
                            return false; 
                    } 
              
                    return true; 
                } 
              
                // Determine the smallest and biggest 
                // palindromes in a given string 
                public static void lengthPalindrome(int temp, String words[]) 
                { 
                    
                    int count = 0; 
                    String smallest = "", longest = ""; 
                    
                    for (int i = 0; i < temp; i++) { 
                        
                        if (checkPalin(words[i])) { 
                            count++; 
                            
                            // Initialize smallest and longest 
                            // when first palindromic word 
                            // is found 
                            if (count == 1) 
                                smallest = longest = words[i]; 
              
                            // Compare smallest and longest with each 
                            // palindromic words 
                            else { 
                                
                                // If length of smallest is greater 
                                // than next palindromic word then 
                                // Store that word in smallest 
                                if (smallest.length() 
                                    > words[i].length()) 
                                    smallest = words[i]; 
              
                                // If length of longest is less 
                                // than next palindromic word then 
                                // Store that word in longest 
                                if (longest.length() 
                                    < words[i].length()) 
                                    longest = words[i]; 
                            } 
                        } 
                    } 
              
                    if (count == 0) 
                        
                        System.out.println("No palindrome found"); 
                    
                    else { 
                        
                        System.out.println("Smallest palindrome: "
                                           + smallest); 
                        System.out.println("Biggest palindrome: "
                                           + longest); 
                    } 
                } 
              
                public static void main(String[] args) 
                { 
                    
                    String string = "Wow Madam is driving racecar"; 
                    String word = ""; 
                    
                    String[] words = new String[100]; 
                    int temp = 0; 
              
                    // Add extra space after string 
                    // to get the last word 
                    string = string + " "; 
              
                    for (int i = 0; i < string.length(); i++) { 
                        
                        // Split the string into words 
                        if (string.charAt(i) != ' ') { 
                            word = word + string.charAt(i); 
                        } 
                        
                        else { 
                            
                            // Add word to array words 
                            words[temp] = word; 
                            temp++; 
                            word = ""; 
                        } 
                    } 
                    
                    System.out.println("Inputted String : " + string); 
                    lengthPalindrome(temp, words); 
                } 
            }