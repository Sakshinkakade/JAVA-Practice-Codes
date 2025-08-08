public class ArrayAsFunArgu
{
    public static void update(int marks[], int x)
    {
        x = 10;
        for(int i=0; i<marks.length; i++)// condition is not <= here its < only
        {
            marks[i] += 1;

            System.out.println(marks[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int marks[] = {97, 98, 99};
        int x = 5; 

        update(marks, x);

        System.out.println(x);
        /*for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]+" ");
        }*/
    }
}