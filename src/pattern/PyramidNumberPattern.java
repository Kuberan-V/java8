package pattern;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        int n=12;
        int i,j,k;
        for(i=1;i<=n;i++){
            k=i;
            for(j=(n-i)*3;j>0;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                if(k<10 )
                    System.out.print(k+"  ");
                else
                    System.out.print(k+" ");
                k++;
            }
            k--;
            for(j=i;j>1;j--){
                k--;
                if(k<10 )
                    System.out.print(k+"  ");
                else
                    System.out.print(k+" ");
            }
            System.out.println();

        }
        /*int num = 5;
        int x = 0;

        // Outer loop for rows
        for (int i = 1; i <= num; i++) {
            x = i - 1;

            // inner loop for "i"th row printing
            for (int j = i; j <= num - 1; j++) {

                // First Number Space
                System.out.print(" ");

                // Space between Numbers
                System.out.print("  ");
            }

            // Pyramid printing
            for (int j = 0; j <= x; j++)
                System.out.print((i + j) < 10
                        ? (i + j) + "  "
                        : (i + j) + " ");

            for (int j = 1; j <= x; j++)
                System.out.print((i + x - j) < 10
                        ? (i + x - j) + "  "
                        : (i + x - j) + " ");

            // By now we reach end for one row, so
            // new line to switch to next
            System.out.println();
        }*/

    }
}
