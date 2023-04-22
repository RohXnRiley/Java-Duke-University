public class WordLength
{

    public static void getMaxLength(int arr[])
    {
        int max = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("The maximum frequency is for : "+max);
    }

    public static void countWordLengths(String str)
    {

        //Strip the sentence of anything other than letters and space
        String strs[] = str.split(" ");
        for(int i = 0; i < strs.length; i++)
        {
            String word = strs[i];

            char lastCh = word.charAt(word.length()-1);
            if(!Character.isLetter(lastCh))
            {
                word= word.substring(0, word.length()-1);
            }
            else continue;

            strs[i] = word;
        }

        int freq[] = new int[strs.length];

        for(int i = 0; i < strs.length; i++)
        {
            String word = strs[i];
            int len = word.length();
            freq[len]++;
        }

        for(int i = 0; i < freq.length; i++)
        {
            if (freq[i] != 0)
            {
                System.out.println(i + "'s frequency is : "+freq[i]);
            }
        }

        getMaxLength(freq);
    }
    public static void main(String[] args) {
        // Constraint : Assuming that the max length of any string does not exceed the length of the string

        String message = "Laer. My necessaries are embark'd. Farewell. And, sister, as the winds give benefit";
        countWordLengths(message);
    }
}