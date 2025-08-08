/*import java.util.*;

public class FunWithPara
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum is :" + sum);
    }
}*/

/*import java.util.*;

public class FunWithPara
{
    public static void printsum()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is : "+ sum);
    }

    public static void main(String args[])
    {
        printsum();
    }
}*/

import java.util.*;

public class FunWithPara
{
    public static int printsum(int num1, int num2) // parameters or formal parameters
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = printsum(a,b);//arguments or actual parameters
        System.out.println(sum);

    }
}

