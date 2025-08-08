import java.util.*;

public class AvgOfThreeNO
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no. : ");
        int no1 = sc.nextInt();

        System.out.println("Enter 2nd no. :");
        int no2 = sc.nextInt();

        System.out.println("Enter 3rd no. : ");
        int no3 = sc.nextInt();

        float avg = (no1 + no2 + no3)/3;

        System.out.println("The average is : "+avg); 

    } 
}