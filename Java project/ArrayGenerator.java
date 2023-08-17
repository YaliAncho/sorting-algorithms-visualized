import java.util.Random;

public class ArrayGenerator 
{
    

    public int[] NewArray(int length) 
    {
        
        Random random = new Random();
        int[] generatedArray = new int[length];
        for(int i = 0; i < length; i++) 
        {
            generatedArray[i] = random.nextInt(101);
        }

        return generatedArray;
    }

    
}