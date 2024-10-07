package pattern;

public class ReversePyramidStar {
    public static void main(String[] args) {
        int n=7;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<(2*(n-i)-1);j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
