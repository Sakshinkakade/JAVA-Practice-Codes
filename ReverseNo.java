import java.util.*;
public class ReverseNo
{
    public static void main(String args[])
    {
        //using whilw loop
        /*int n = 13022004;
        int rev = 0;
        while(n>0)
        {
            int lastDigit = n % 10;

            rev = (rev * 10)+ lastDigit;
            n = n/10; 
        }
        System.out.println(rev);*/


        //using for loop
        /*int rev =0;

        for(int n = 13022004; n>0; n=n/10)
        {
            int lastdigit = n%10;
            rev = (rev * 10)+lastdigit;
        }
        System.out.println(rev);*/

        //taking usr input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. : ");
        int n = sc.nextInt();

        int rev = 0;
        while(n > 0)
        {
            int lastdigit = n % 10;
            rev = (rev * 10)+ lastdigit;
            n = n/10;
        }

        System.out.println(rev);
    }
}