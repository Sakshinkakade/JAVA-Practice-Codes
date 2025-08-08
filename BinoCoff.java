// functions
// binomial coefficient 
import java.util.*;

public class BinoCoff 
{   
    public static int factorial(int a)
    {
        int fact = 1;
        for(int i = 1; i<=a; i++)
        {
            fact = fact*i;
        }

        return fact;
    }
    public static int binomialcoef(int n, int r)
    {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);

        int binocoeficient = nfact / (rfact * nmrfact);
        return binocoeficient;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr two numbers");

        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(binomialcoef(n, r));
    }
}