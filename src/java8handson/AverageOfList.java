package java8handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageOfList {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,3,45,5,6,67,54,5);
        Integer sumof=arr.stream().reduce(0,Integer::sum);
        double avg=arr.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(avg);

        Integer maximum=arr.stream().max(Integer::compare).orElse(null);
        Integer minimum=arr.stream().min(Integer::compare).orElse(null);
        System.out.println(maximum+","+minimum);

        Integer secondLowest= arr.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        Integer secondLargest= arr.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondLargest+", "+secondLowest);
        System.out.println(sumof);
        
    }
}
