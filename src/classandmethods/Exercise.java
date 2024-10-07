package classandmethods;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Java program that prints the odd and even numbers using two threads.
// the time complexity of the program is O(N), where N is the number up to which we
// are displaying the numbers
class Customer{
    int amount=10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        while(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{wait();}catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... ");
        notify();
    }
}

class Exercise{
    public static void main(String args[]) throws ParseException {

        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        checkNull.ifPresent(System.out::println);   // printing value by using method reference
        System.out.println(checkNull.get());    // printing value by using get method
        System.out.println(str[5].toLowerCase());
        Optional<String> empty=Optional.empty();
        System.out.println(empty);
        Optional<String> value= Optional.of(str[5]);
        System.out.println(empty.isPresent());
        System.out.println(value.isPresent());
        System.out.println(value.get());
        System.out.println(Optional.ofNullable(str[5]));
        System.out.println(value.orElse("value is not present"));
        System.out.println(empty.orElse("value is not present"));
        int[] arr=new int[]{5,22,45,87,12};
        for(int i:arr){
            System.out.print(i+" ");
        }
        Arrays.parallelSort(arr);
        System.out.println();
        for (int i:arr){
            System.out.print(i+" ");
        }

        List.of();
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
        for(String l:set) {
            System.out.println(l);
        }
        List<Integer> list
                = Stream.of(2,4,6,7,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+", "+m.getValue());
        }
        System.out.println(map.descendingMap());


        for(int i =1;i<5;i++){
            for(int j=1;j<5;j++){
                if(j==2)
                    break;
                System.out.println(i+" "+j);
            }

        }
    }}