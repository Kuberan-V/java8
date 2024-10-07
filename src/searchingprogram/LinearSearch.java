package searchingprogram;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array={3,4,1,7,5};
        int k=4;
        int index=0;
        for(int j = 0;j<array.length;j++){
            if(array[j]==k) {
                index=j;
                break;
            }
            else{
                index=-1;
            }
        }
        if(index==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at position "+index);
    }
}
