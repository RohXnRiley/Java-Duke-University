public class Wordplay {
    

    public static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);

        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            return true;
        }
        return false;
    }

    public static String replaceVowels(String str, char ch)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                if(isVowel(str.charAt(i)))
                {
                    String one = str.substring(0,i);
                    String two = str.substring(i+1);
                    str = one + ch + two;
                    
                }
            }
        }

    return  str;
    }

    public static String emphasize(String str, char ch1, char ch2)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                if(isVowel(str.charAt(i)) && i%2 == 0)
                {
                    String one = str.substring(0,i);
                    String two = str.substring(i+1);
                    str = one + ch1 + two;
                    
                }

                else if(isVowel(str.charAt(i)) && i%2 != 0)
                {
                    String one = str.substring(0,i);
                    String two = str.substring(i+1);
                    str = one + ch2 + two;
                    
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        
        String str = "Myname is Rohan DEy.";
        String newstring = emphasize(str, '+', '*');
        String newstring2 = replaceVowels(str, '$');
        System.out.println(newstring);
        System.out.println(newstring2);
    }
}
