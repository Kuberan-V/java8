package com.coding;

import java.util.Scanner;

public class HourAndMinute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hour");
        int hour=sc.nextInt();
        System.out.println("Enter the Minutes");
        int minute=sc.nextInt();
        if(hour>12 || hour<0 || minute>60 || minute<0)
            System.out.println("wrong input");
        else {
            if(hour==12)
                hour=0;
            if(minute==60){
                hour=hour+1;
                minute=0;
            }
            int hangle=(int)(((hour*60)+minute)*0.5);
            int mangle=(int)(minute*6);
            int angle=Math.abs(hangle-mangle);
            angle=Math.min(360-angle,angle);
            System.out.println("The angle between hour and minute hand is "+angle);


        }
    }
}
