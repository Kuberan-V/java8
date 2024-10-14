package com.coding.pattern;

import java.util.Scanner;

public class UpperTraingularSpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int[][] matrix=new int[n][n];
        fillMatrixPattern(matrix,n);
        printMatrix(matrix,n);
    }
    private static void fillMatrixPattern(int[][] matrix, int n) {
        int value=1;
        int count=0;
        for(int diag=0;diag<n;diag++){
            matrix[diag][diag]=value++;
            count=count+(diag+1);
        }
        int colLow=1,colUp=n-1;
        int rowLow=0,rowUp=n-2;
        while(colLow<=colUp && rowLow<=rowUp){
            for(int i=rowUp, j=colUp;i>=rowLow;i--){
                matrix[i][j]=value++;
            }
            colUp--;
            rowUp--;
            for(int j=colUp,i=rowLow;j>=colLow;j--){
                matrix[i][j]=value++;
            }
            rowLow++;
            colLow++;
            for(int i=rowLow,j=colLow;i<=rowUp;i++,j++){
                matrix[i][j]=value++;
            }
            rowUp--;
            colLow++;


        }

    }
    private static void printMatrix(int[][] matrix, int n) {
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    System.out.print("   ");
                }
                if(matrix[i][j]<10 && matrix[i][j]>0){
                    System.out.print(matrix[i][j]+"  ");
                }
                if(matrix[i][j]>9){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
