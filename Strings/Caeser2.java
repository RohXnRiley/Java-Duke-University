public class Caeser2 {
    
    public static String encrypt(String str, int key)
    {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String encrypted_alphabets = alphabet.substring(key) + alphabet.substring(0, key);
        // return encrypted_alphabets;
        String org = str;
        str = str.toUpperCase();
        String cipher = "";
        for(int i = 0; i < str.length(); i++)
        {
        
        if(Character.isAlphabetic(str.charAt(i)))
        {
            if(Character.isUpperCase(org.charAt(i)))
            cipher = cipher + encrypted_alphabets.charAt(alphabet.indexOf(str.charAt(i)));
            else
            cipher = cipher + Character.toLowerCase(encrypted_alphabets.charAt(alphabet.indexOf(str.charAt(i))));
        }
        else
        cipher = cipher + str.charAt(i);
        }

        
        return cipher;
    }
    public static void main(String[] args) {
        
        System.out.println(encrypt("My Name is Rohan dey", 13));
    }
}
