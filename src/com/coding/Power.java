package com.coding;

public class Power {
    static int power(int a,int n){
        if(n==0)
            return 1;
        return a*power(a,n-1);
    }
    public static void main(String[] args) {
        int a =7;
        int n=1;
        System.out.println(power(a,n));
    }
}
