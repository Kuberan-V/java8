package java8handson;

import java.util.List;

public class SumOfOddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> arr=List.of(1,2,3,4,5,6,7,8,9,10);
        int odd=arr.stream().filter(i -> i%2==0).mapToInt(Integer::intValue).sum();
        int even = arr.stream().filter(i -> i%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println(odd+" "+even);
    }
}
