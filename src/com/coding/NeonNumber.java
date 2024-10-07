package com.coding;

public class NeonNumber {
    static boolean checkNeon(int n){
        int s=n*n;
        int sum=0;
        while(s!=0){
            sum=sum+(s%10);
            s/=10;
        }
        if(sum==n)
            return true;
        return false;
    }
    public static void main(String[] args) {
    int n=8;
    if(checkNeon(n))
        System.out.println(n+" is a neon number");
    else
        System.out.println(n+" is not a neon number");
    }
}
