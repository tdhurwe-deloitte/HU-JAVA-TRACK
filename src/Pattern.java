public class Pattern {
    public static void main(String args[])
    {
        int n = 7;
        for(int i = 1; i <= n; i++)
        {
            for(int j = n-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a = 1; a <= (n - 1); a++)
        {
            for(int b = 1; b <= a; b++)
            {
                System.out.print(" ");
            }
            for(int c = n-1; c >= a; c--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
