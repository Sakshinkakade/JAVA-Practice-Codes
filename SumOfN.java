// sum of n natural numbers 

import java.util.*;

public class SumOfN
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number range :");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;

        while(counter <= n)
        {
            sum += counter;
            counter ++;
        }
        System.out.println(sum);
    }
}