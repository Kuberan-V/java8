package java8handson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToULcase {
    public static void main(String[] args) {
        List<String> arr= Arrays.asList("KuBeRan","RaMeSH","MAheSH","VenKAt");
        List<String> upperCase=arr.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
        List<String> lowerCase=arr.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCase);


    }

}
