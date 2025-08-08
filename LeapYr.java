import java.util.*;

public class LeapYr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any year");
        int yr = sc.nextInt();

        if(yr % 4 == 0)
        {
            if(yr % 100 == 0)
            {
                if(yr % 400 == 0)
                {
                    System.out.println("Leap year");
                }
                else
                {System.out.println("Not a leap yr");}
            }
            else 
            {System.out.println("Leap year");}
        }
        else{System.out.println("Not a leap yr");}

        

    }
}