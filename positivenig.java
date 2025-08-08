import java.util.*;

public class positivenig
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no to check wether it kis positive or nigative : ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("number is positive");
        }
        else if(num == 0)
        {
            System.out.println("zero cannt be positive or nigative :");
        }
        else
        {
            System.out.println("number is nigative");
        }
    }
}