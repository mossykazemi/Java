package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CharFinder finder = new CharFinder();

        ///var ch= finder.FindFirstNonRepeatingChar("a green apple");
        //System.out.println(ch);


        ///var ch= finder.findFirstRepeatedChar("green apple");
        //System.out.println(ch);

        //===============

        ///when our keys are integer
        //Map<Integer, String> map = new HashMap<>();
        //map.put(123456,"Mossy");
        //System.out.println(hash(123456));


        ///when our keys are string
        Map<String, String> map = new HashMap<>();
        map.put("123456-A", "Mossy");
        System.out.println(hash("123456-A"));

        //===========
        String str= "Orange";
        System.out.println(str.hashCode());
    }

    //when our keys are integer
    //public static int hash(int number){
    //    return number % 100;
    //}

    //when our keys are string
    public static int hash(String key) {
        int hash = 0;
        for (var ch : key.toCharArray())
            hash += ch;
        return hash % 100;
    }
}
