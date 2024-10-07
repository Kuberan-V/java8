package pattern;

public class UpperStarTriangle {
    public static void main(String[] args) {
        int n=7;
        int[] a=new int[5];

        int i,j;
        for(i=0;i<n;i++){
            for(j=i;j<n-1;j++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
