package classandmethods;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCol {
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<Integer>();
        for(int i=1;i<10;i++)
            alist.add(i);
        System.out.println(alist);
        System.out.println(alist.get(4));
        alist.add(100);
        alist.add(100);
        alist.remove(5);
        System.out.println(alist);
        alist.add(2,11);
        System.out.println(alist.get(2));
        System.out.println(alist.get(3));
        System.out.println(alist);
        System.out.println(alist.get(5));
        Iterator<Integer> i=alist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
