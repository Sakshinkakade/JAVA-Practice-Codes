/*public class HalfPyramidPattern
{
    public static void main(String args[])
    {
        for(int i = 1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

public class HalfPyramidPattern
{
    public static void main(String args[])
    {
        //int n = 1;
        char ch= 'A';
        for(int i = 1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
                ch++;

                //System.out.print(n);
                //n++;
            }
            System.out.println();
        }
    }
}