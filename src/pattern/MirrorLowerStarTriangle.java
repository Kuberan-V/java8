package pattern;

public class MirrorLowerStarTriangle {
    public static void main(String[] args) {
        int n=7;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i;j>0;j--)
                System.out.print(" ");
            for(j=i;j<n;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=i;j<n-1;j++)
                System.out.print(" ");
            for(j=i;j>=0;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
