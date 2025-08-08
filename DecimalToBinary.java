import java.util.*;

public class DecimalToBinary
{
    public static void DecToBi(int i)
    {
        int decnum = i;
        int pow = 0;
        int binum = 0;

        while(i>0)
        {
            int rem = i%2;
            binum = binum + (rem * (int)Math.pow(10, pow));

            pow ++;
            i = i/2;
        }
        System.out.println("Binary of "+ decnum +" : "+binum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number : ");

        int i = sc.nextInt();

        DecToBi(i);
    }
}