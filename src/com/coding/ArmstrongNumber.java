package com.coding;

public class ArmstrongNumber {
    static void armstrongNumbers(int n1,int n2){
        for(int i=n1+1;i<n2;i++){
            int j=i;
            int N=0;
            int sum=0;
            while(j!=0){
                j/=10;
                N++;
            }
            j=i;
            while(j!=0){
                int d=j%10;
                sum += Math.pow(d, N);
                j/=10;
            }
            if(sum==i)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int x=0;
        int y=160;
        armstrongNumbers(x,y);
    }
}
