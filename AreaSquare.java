import java.util.*;

public class AreaSquare 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of square : ");
        float side = sc.nextFloat();

        float area = side*side;

        System.out.println("Area of square is : " + area);
    }
}