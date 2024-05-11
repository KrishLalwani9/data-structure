public class Patterns {
    public static void hollow_rectangle(int totRows,int totColms)
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=1;j<=totColms;j++)
            {
                if(i==1 || j==1 || j==totColms || i==totRows)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void inverted_roated_half_pyramid(int n)
    {

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String krish[])
    {
       // hollow_rectangle(20, 20);
       inverted_roated_half_pyramid(8);
    }
}
