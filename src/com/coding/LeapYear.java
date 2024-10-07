package com.coding;

public class LeapYear {
    static boolean isLeapYear(int year){
        /*if((year%400==0) || ((year%4==0) && year%100!=0)){
            return true;
        }
        return false;*/
        /*boolean isLeap=((year%400==0) || ((year%4==0) && year%100!=0)) ? true:false;
        return isLeap;*/
        return ((year%400==0) || ((year%4==0) && year%100!=0)) ? true:false;
    }
    public static void main(String[] args) {
        int year=2010;
        boolean isLeap=isLeapYear(year);
        if(isLeap==true)
            System.out.println(year+" is a Leap Year");
        else
            System.out.println(year+" is not a Leap Year");
    }
}
