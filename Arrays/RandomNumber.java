import java.util.Random;
public class RandomNumber
{
    public static int roll()
    {
        Random random = new Random();
        int num = random.nextInt(6)+1;
        return num;
    }

    public static int count_rolls(int rolls)
    {
    // int arr[] = new int[6];
    int arr[] = {0,0,0,0,0,0,};
        for(int i = 0; i < rolls; i++)
        {
            int roll = roll();
            arr[roll-1]++;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(i+1 + "'s frequency is : "+arr[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        
        count_rolls(1000);
    }
}