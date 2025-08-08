/*import java.util.Scanner;

public class ArmstrongNumber 
{
    public static boolean isArmstrong(int num) 
    {
        String numStr = String.valueOf(num);
        int numDigits = numStr.length();
        int sum = 0;
        int temp = num;

        while (temp > 0) 
        {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //int number = 153;
        if (isArmstrong(n)) 
        {
            System.out.println(n + " is an Armstrong number.");
        } 
        else {
            System.out.println(n + " is not an Armstrong number.");
}
}
}*/


import java.util.Scanner;

public class ArmstrongNumber
{
    public static boolean isArmstrong(int num)
    {
        String numstr = String.valueOf(num);
        int length = numstr.length();
        int sum = 0;
        int temp = num;

        while(num > 0)
        {
            int lastdigit = num % 10;
            sum += Math.pow(lastdigit, length);
            num /= 10;
        }

        return sum == temp;
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the number to check if Armstrong or not : ");
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isArmstrong(num))
        {
            System.out.println(num + " is an armstrong number");
        }
        else
        {
            System.out.println(num + " is not an armstrong number");
        }
    }
}
