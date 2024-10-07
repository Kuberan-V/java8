package com.coding;

import java.util.Arrays;
import java.util.HashSet;

public class Triplets {
    static void findTriplets(int[] arr,int n){
        boolean found=false;
        for(int i=0;i<n-2;i++)
            for(int j=i+1;j<n-1;j++)
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                    }
                }
        if(found==false)
            System.out.println("not exist");
    }
    static void findTripletsWithSet(int arr[], int n)
    {
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            // Find all pairs with sum equals to
            // "-arr[i]"
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = i + 1; j < n; j++) {
                int x = -(arr[i] + arr[j]);
                if (s.contains(x)) {
                    System.out.printf("%d %d %d\n", x,
                            arr[i], arr[j]);
                    found = true;
                }
                else {
                    s.add(arr[j]);
                }
            }
        }

        if (found == false) {
            System.out.printf(" No Triplet Found\n");
        }
    }
    static void findTripletsWithSort(int arr[], int n)
    {
        boolean found = false;

        // sort array elements
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            // initialize left and right
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == 0) {
                    // print elements if it's sum is zero
                    System.out.print(x + " ");
                    System.out.print(arr[l] + " ");
                    System.out.println(arr[r] + " ");

                    l++;
                    r--;
                    found = true;
                }

                // If sum of three elements is less
                // than zero then increment in left
                else if (x + arr[l] + arr[r] < 0)
                    l++;

                    // if sum is greater than zero then
                    // decrement in right side
                else
                    r--;
            }
        }

        if (found == false)
            System.out.println(" No Triplet Found with sort");
    }
    public static void main(String[] args) {
        int[] arr={1, -2, 1, 0, 5};
        int n=arr.length;
        findTripletsWithSet(arr,n);
        findTriplets(arr,n);
        findTripletsWithSort(arr,n);

    }
}
