//While loop 
//1 to 10 numbers 
// 1 to n numbers 

/*import java.util.*;

public class PrintOneToTenWhile
{
    public static void main(String args[])
    {
        int counter = 1;
        while(counter <= 10)
        {
            //System.out.println(counter);
            System.out.print(counter + " ");
            counter ++;
        }

    }
}*/

import java.util.*;

public class PrintOneToTenWhile
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to print : ");
        int n = sc.nextInt();
        int counter = 1;

        while(counter <= n)
        {
            System.out.print(counter + " ");
            counter ++;
        }
    }
}

