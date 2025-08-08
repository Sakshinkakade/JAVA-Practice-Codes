public class ArrayReverse
{
    
    public static void reversarray(int number[])
    {
        int start = 0, end = number.length-1;

        while(start < end)
        {
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp ;

            start ++;
            end --;
        }


    }
    public static void main(String args[])
    {
        int number[] = {12, 10, 34, 54, 78, 87};
        reversarray(number);

        System.out.println("reverse array is : ");
        for(int i =0; i<number.length; i++)
        {
            System.out.print(number[i] + " ");
        }
    }
}
