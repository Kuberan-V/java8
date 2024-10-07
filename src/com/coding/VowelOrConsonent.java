package com.coding;

public class VowelOrConsonent {
    static String vowelOrConsonent(char ch){
        String s="aeiouAEIOU";
        return (s.indexOf(ch)==-1)? "Consonent":"Vowel";
    }
    public static void main(String[] args) {
        System.out.println("H is "+vowelOrConsonent('H'));
        System.out.println("I is "+vowelOrConsonent('I'));

    }
}
