import java.util.*;

public class PrimeNoUsingFun
{
    public static boolean isprime(int a)
    {
        if(a == 2)
        {
            return true;
        }
        //for(int i = 2; i<=a-1; i++)

        for(int i = 2; i<= Math.sqrt(a); i++)
        {
            if(a % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println(isprime(16));
    }
}