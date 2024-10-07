package classandmethods;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,5,4,3,0,1};
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }

        Iterator<Integer> iterator=set.iterator();
        System.out.println(set.size());
    }
}
