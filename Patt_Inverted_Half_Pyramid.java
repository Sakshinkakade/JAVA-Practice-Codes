import java.util.*;

public class Patt_Inverted_Half_Pyramid
{
    public static void Half_Pyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {System.out.print(" ");}

            for(int j=1; j<=i; j++)
            {System.out.print("*");}
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row numbers :");
        int n = sc.nextInt();

        Half_Pyramid(n);
    }
}