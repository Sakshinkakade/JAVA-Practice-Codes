//printing digit one by one 

public class PrintReverse
{
    public static void main(String args[])
    {
        int n = 13022004;

        while(n >0)
        {
            int lastno = n % 10;
            System.out.print(lastno);
            n = n/10;
        }
    }
}