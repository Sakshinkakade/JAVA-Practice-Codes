public class ArrayLargestElem
{
    public static int largestelement(int number[])
    {
        int large = Integer.MIN_VALUE;

        for(int i =0; i<number.length; i++)
        {
            if(large < number[i])
            {
                large = number[i];
            }
        }

        return large;
    }

    public static int smallestelement(int number[])
    {
        int small = Integer.MAX_VALUE;

        for(int i = 0; i<number.length; i++)
        {
            if(small > number[i])
            {
                small = number[i];
            }
        }

        return small;
    }

    public static void main(String args[])
    {
        int number[] = {22,6,34,87,13,22,56,2};
        //int largenum = largestelement(number); 
        //int smallnum = smallestelement(number);

        System.out.println("Smallest num is :"+ smallestelement(number));
        System.out.println("Largest num is :"+ largestelement(number));
    }
}