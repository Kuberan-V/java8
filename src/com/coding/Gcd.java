package com.coding;

public class Gcd {
    static int gcd(int n1,int n2){
        if(n1==0)
            return n2;
        return gcd(n2%n1,n1);
    }
    public static void main(String[] args) {
        int x=50;
        int y=15;
        int ans=gcd(x,y);
        System.out.println("GCD of "+x+" and "+y+" is "+ans);
    }
}
