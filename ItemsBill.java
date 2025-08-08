import java.util.*;

public class ItemsBill
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of pen : ");
        float p1 = sc.nextFloat();

        System.out.println("Enter the price of pencil : ");
        float p2 = sc.nextFloat();

        System.out.println("Enter the price of eraser : ");
        float p3 = sc.nextFloat();

        float total = p1+p2+p3;

        System.out.println("Total bill is : "+ total);

        float GSTp1 = (p1 * (18f/100f));
        float GSTp2 = (p2 * (15f/100f));
        float GSTp3 = (p3 * (10f/100f));

        float totalGST = GSTp1 + GSTp2 + GSTp3;
        float finalbill = total + totalGST;

        System.out.println("Ttal amount with GST : " + finalbill);




        /* another logic 

        float Totalamt = total + (0.18f * total);
        System.out.println("Total bill with gst : "+ Totalamt);*/
    }
}