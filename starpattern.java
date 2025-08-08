//starr pattern 
/*public class starpattern
{
    public static void main(String args[])
    {
        for(int i= 1; i<=4; i++)//for line count
        {
            for(int j=1; j<=i; j++)// for column count or for star count per line
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}*/

//inverted star pattern
/*public class starpattern
{
    public static void main(String args[])
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=4;j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//another logic
public class starpattern
{
    public static void main(String args[])
    {
        int n = 4;
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<= n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}