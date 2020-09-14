package com.learnprogramming;

import java.util.HashMap;
import java.util.Scanner;

public class CharCounter {

    public static void main(String[] args) {
        System.out.println("Write something:");
        String sentence = (new Scanner(System.in)).nextLine();
        char[] chars = sentence.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: chars) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(Character c: map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
