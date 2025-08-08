import java.util.*;

public class Patt_Half_Pyramid_with_num
{
    public static void Half_Pyram_num(int n)
    {
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Half_Pyram_num(n);
    }
}