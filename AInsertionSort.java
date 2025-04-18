import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        int temp;
        for(int i =1; i<myNumbers.length;i++)
        {
            for(int j =i; j>0; j--)
            {

                if(myNumbers[j] <myNumbers[j-1])
                {
                    temp = myNumbers[j];
					myNumbers[j] = myNumbers[j - 1];
					myNumbers[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}
