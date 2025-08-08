public class TypePromotion
{
    /*public static void main(String args[])
    {
        char a = 'a';
        char b = 'b';

        System.out.println(a+b);
    }*/

   /*public static void main(String args[])
   {
        short a = 12;
        short b = 12;
        int c = a+b;
        System.out.println(c);
   }*/

    /*public static void main(String args[])
    {
        byte b = 1;
        short sh = 12;
        char d = 'd';

        System.out.println(b+sh+d);
    }*/

    /*public static void main(String args[])
    {
        int i = 22;
        long l = 10000;
        float f = 10.5f;
        double d = 100.50;
        System.out.println(i + l + f + d);
    }*/

    /*public static void main(String args[])
    {
        byte b1 = 5;           // this will show an error coz the time we use any operator the operand and operator together becomes expression. 
        byte b2 = b1*2;        // and at the time it becomes expretion there is type promotion performed by java and the byte converts into int .
        System.out.println(b2);// so now b1*2 becomes int but we are trying to save it into byte data type. so its showing an error.
    }*/

    // instead if we directly print out b1*2 instead of saving it into b2. the code will run successfully.

    public static void main(String args[])
    {
        byte b1 = 12;
        System.out.println(b1*2);
    }
}