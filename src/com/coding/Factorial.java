package com.coding;

public class Factorial {
    static void factorial(int n){
        int f=1;
        for(int i=2;i<=n;i++)
            f*=i;
        System.out.println(f);

    }
    public static void main(String[] args) {
        int n=0;
        factorial(n);
    }
}
