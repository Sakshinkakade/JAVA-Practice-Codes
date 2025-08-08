import java.util.*;

public class multiplicationTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        int mult;

        for(int i =1; i<=10; i++)
        {
            mult = i*n;
            System.out.println(n + " * " +i+ " = " + mult);
        }
    }
}