package pattern;

public class SquareStarWithDiagonal {
    public static void main(String[] args) {
        int rows=12;
        int i,j;
        for(i=1;i<=rows;i++) {
            for (j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows || i == j || j == rows - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
