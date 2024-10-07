package com.coding;

import java.util.*;
import java.util.stream.Collectors;


public class NoOfOccurrence {
    public static void main(String[] args) {
        String str="Kuberan is a naughtky";
        str=str.toLowerCase();
        str=str.replaceAll(" ","");
        //Map<String,Long> result=Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
        //System.out.println(result);
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            al.add(str.charAt(i));
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.putIfAbsent(al.get(i),Collections.frequency(al,al.get(i)));
        }
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
            }
        }

}
