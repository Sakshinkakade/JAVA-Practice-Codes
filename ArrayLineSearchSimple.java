public class ArrayLineSearchSimple
{
    public static int linearsearch(int number[], int key)
    {
        for(int i = 0; i< number.length; i++)
        {
            if(number[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int number[] = {1,23,25,45,14,41};
        int key = 23;

        int index = linearsearch(number, key);

        if(index == -1)
        {
            System.out.println("Not found");
        }
        else{
            System.out.println("Key found at index "+ index);
        }

    }
}