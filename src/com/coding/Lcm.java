package com.coding;

public class Lcm {
    static void lcm(int n1,int n2){
        int m=n1>n2 ? n1:n2;
        while(true){
            if(m%n1==0 && m%n2==0)
                break;
            m++;
        }
        System.out.println("The LCM of "+n1+" and "+n2+" is "+m);
    }
    public static void main(String[] args) {
        int x=15;
        int y=25;
        lcm(x,y);

    }
}
