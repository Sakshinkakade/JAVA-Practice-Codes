import java.util.*;

public class ArrayBasic
{
    public static void main(String args[])
    {
        /*int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //updating 
        marks[1]= 100;
        System.out.println(marks[1]);*/

        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);

        marks[0] = 12;
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        marks[1] = 20;
        System.out.println(marks[1]);

        float avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Avg :"+ avg);

        System.out.println("lenth = "+ marks.length);
    }
}

