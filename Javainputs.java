import java.util.*;

public class Javainputs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);// object name can be anything ek sc or s or scanner etc.
        
        System.out.println("Enter string");
        String input = sc.next();
        System.out.println(input);

        System.out.println("Enter string");
        String sent = sc.nextLine();
        System.out.println(sent);

        System.out.println("Enter integer");
        int number = sc.nextInt();
        System.out.println(number);

        System.out.println("Enter byte");
        byte ran = sc.nextByte();
        System.out.println(ran);

        System.out.println("Enter float");
        float fla = sc.nextFloat(); // input : 15.5 and not 15.5f
        System.out.println(fla);

        System.out.println("Enter double");
        double dbl = sc.nextDouble();
        System.out.println(dbl);

        System.out.println("Enter sboolean");
        boolean bln = sc.nextBoolean();
        System.out.println(bln); // it dosent takes 1or 0 as input only takes true or false
    
        System.out.println("Enter short");
        short srt = sc.nextShort();
        System.out.println(srt);  

        System.out.println("Enter long int");
        long lng = sc.nextLong();
        System.out.println(lng);

    }
}