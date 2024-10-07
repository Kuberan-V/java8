package java8handson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,2,4,3,4,5,6,7,5,4,1);
        List<Integer> duplicatesRemoved=arr.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicatesRemoved);
        List<String> stringList=Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        char startingLetter='t';
        long count=stringList.stream().filter(s->s.startsWith(String.valueOf(startingLetter))).count();
        System.out.println(count);
        List<String> ascendSort = stringList.stream().sorted().collect(Collectors.toList());
        List<String> descendSort = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ascendSort);
        System.out.println(descendSort);
    }
}
