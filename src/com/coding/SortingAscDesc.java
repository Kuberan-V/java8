package com.coding;

import java.util.Arrays;

public class SortingAscDesc {
    static void sort(int[] arr,int n){
        int k;
        for(int i=1,a=0;i<n-1;i=i+2,a=a+2){
            for(int j=i+2,b=a+2;j<n;j=j+2,b=b+2){
                if(arr[i]>arr[j]){
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
                if(arr[a]<arr[b]){
                    k=arr[a];
                    arr[a]=arr[b];
                    arr[b]=k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={23,43,12,55,4,67,6,20,83,32,45};
        int n=arr.length;
        sort(arr,n);
    }
}
