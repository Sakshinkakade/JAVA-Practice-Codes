/*public class sum
{
    public static void main(String args[])
    {
        int a = 23;
        int b = 12;
        int c = a + b;
        System.out.println(c);
    }
}*/

import java.util.*;

public class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("\nEnter Second num : ");
        int b = sc.nextInt();

        int sumof = a+b;
        System.out.println(sumof);
    }
}