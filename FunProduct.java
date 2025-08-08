import java.util.*;

public class FunProduct
{
    public static float multiplication(float num1, float num2)
    {
        float mult = num1*num2;
        return mult;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float mult = multiplication(a, b);
        System.out.println("multiplication of "+ a + " and " +b+ " : "+ mult);

        mult = multiplication(12, 14);
        System.out.println("multiplication of "+ a + " and " +b+ " : "+ mult);
    }
}