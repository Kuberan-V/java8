package pattern;

public class SquareStarPattern {
    public static void main(String[] args) {
        int rows=8,columns=22;
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
