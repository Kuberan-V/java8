package pattern;

public class DownwardTraingleStar {
    public static void main(String[] args) {
        int n=6;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
