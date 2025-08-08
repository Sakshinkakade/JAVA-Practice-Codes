import java.util.*;

public class PrimesInRange
{
    public static boolean isPrime(int a)
    {
        if(a == 2)
        {
            return true;
        }

        for(int i = 2; i<=Math.sqrt(a); i++)
        {
            if(a % i== 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void printinrange(int a)
    {
        for(int i=2; i<=a; i++)
        {
             if(isPrime(i))
             {
                System.out.print(i + " ");
             }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range : ");
        int i = sc.nextInt();

        printinrange(i);

    }
}