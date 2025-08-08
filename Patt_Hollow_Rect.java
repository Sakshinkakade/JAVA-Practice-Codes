import java.util.*;

public class Patt_Hollow_Rect
{
    public static void hollow_rectangle(int totrows, int totcols)
    {
        for(int i=1; i<=totrows; i++)
        {
            for(int j=1; j<=totcols; j++)
            {
                if(i==1 || i==totrows || j==1 || j==totcols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr rows and columns number : ");

        int totrows = sc.nextInt();
        int totcols = sc.nextInt();

        hollow_rectangle(totrows, totcols);
    }
}