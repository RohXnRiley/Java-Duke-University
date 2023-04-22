import java.util.Scanner;

public class Caeser
{
    public static String cipher(String str, int key)
    {
        String org = str; //For case preservation
        str = str.toLowerCase();
        String ciphered_text =  "";
        //Traverse the string
        for(int i = 0; i < str.length(); i++)
        {

            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                int val = (int)ch + key;
                if(val > 122)
                {
                    val = val - 26;
                }
                ch = (char)val;
            }
            if(Character.isUpperCase(org.charAt(i))) //Implementing case preservation
            {
                ch = Character.toUpperCase(ch);
            }
            ciphered_text = ciphered_text+ch;
        }
        return ciphered_text;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string and cypher key");
        String str = sc.nextLine();
        int key = sc.nextInt();
        String cipher = cipher(str, key);
        System.out.println(cipher);
        sc.close();
    }
}