import java.util.*;

public class prblmContinue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter new no : ");
            int n = sc.nextInt();

            if(n % 10 == 0)
            { continue; }
            System.out.println(n);
        }while( n <= 100);
    }
}