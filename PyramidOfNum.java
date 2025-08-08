public class PyramidOfNum 
{
    public static void main(String[] args) 
    {
        //int num = 1;
        for(int i=1; i<=4; i++)
        {
            //for space
            /*for(int j=3; j>=0; j--)
            {
                System.out.print(" ");
            }*/

            //for num 
            for(int l=1; l<=(2*i -1); l++)
            {
                System.out.print("*");
                //num++;
            }

            //for space
            /*for(int k=3; k>=0; k--)
            {
                System.out.print(" ");
            }*/

            System.out.println();

        }
    }

}
