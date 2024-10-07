package com.coding;

public class CompoundInterest {
    public static void main(String[] args) {
        double p=1200,r=5.4,t=2;
        double ci=p*(Math.pow((1+(r/100)),t));
        System.out.println("Compound Interest = "+ci);
    }
}
