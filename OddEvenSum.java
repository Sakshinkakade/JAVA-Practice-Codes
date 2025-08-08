import java.util.*;

public class OddEvenSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int number;
        int evensum = 0;
        int oddsum = 0;
        int choice;

        do{
            System.out.println("Enter number : ");
            number = sc.nextInt();

            if(number % 2 == 0)
            {
                evensum += number;
            }
            else{
                oddsum += number;
            }

            System.out.println("press 1 if u want to continue othervise press 0");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Sum of even numbers : " + evensum);
        System.out.println("Sum of odd numbers : " + oddsum);
    }
}