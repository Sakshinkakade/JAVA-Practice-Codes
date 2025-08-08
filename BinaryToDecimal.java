import java.util.*;

public class BinaryToDecimal
{
    public static void BiToDec(int i)
    {
        int bin = i;
        int power = 0; 
        int decnum = 0;

        while(i > 0)
        {
            int ld = i%10;
            decnum = decnum +(int)(ld* Math.pow(2, power));

            power++;
            i = i/10;
        }
        System.out.println("The decimal conversion of binary number "+ bin + " is : "+ decnum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any no in binary : ");

        int i = sc.nextInt();

        BiToDec(i);
    }
}