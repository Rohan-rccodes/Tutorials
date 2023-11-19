/*
 * 
 * Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false.
*/

class Test
{
    static boolean isVowel(char c)
    {
        if (c == 'a')
        {
            return true;
        }
        else if (c == 'a')
        {
            return true;
        }
        else if (c == 'u')
        {
            return true;
        }
        else if (c == 'e')
        {
            return true;
        }
        else if (c == 'i')
        {
            return true;
        }
        else if (c == 'o')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isStringInsideVowel(String line)
    {
        for (int i = 0; i < line.length(); i++)
        {
            if(isVowel(line.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[])
    {

        System.out.println(Test.isStringInsideVowel("hello"));
                System.out.println(Test.isStringInsideVowel("kmnpdk"));
    }
}