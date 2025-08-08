import java.util.*;

public class ArrayLinearSearch
{
    public static void linearsearch(int number[], int key)
    {
        int index = -1;
        for(int i=0; i<number.length; i++)
        {
            if(number[i] == key)
            {
                index = i;
                break;
            }
        }

        if(index == -1)
        { 
           System.out.println("Not found");
        }
        else
        {
            System.out.println("key at index : "+ index);
        }
    }

    public static void takedisplayarray()
    {
        //take array input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        int number[] = new int[8];

        for(int i = 0; i<number.length; i++)
        {
            number[i] = sc.nextInt();
        }

        //display array
        System.out.println("your array is : ");
        for(int i = 0; i<number.length; i++)
        {
            System.out.print(number[i] +" ");
        }

        //find key
        System.out.print("\nEnetr key to find :");
        int key = sc.nextInt();

        linearsearch(number, key);

    }

    public static void main(String args[])
    {
        takedisplayarray();
        
    }
}
