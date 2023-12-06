package com.company;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Anna");
        map.put(2, "Maxim");
        map.put(3, "Andrey");
        map.put(4, "Danya");
        map.put(5, "Pasha");
        map.put(6, "Oleg");
        map.put(7, "Maxim");
        map.put(8, "Vladimir");
        map.put(9, "Nikita");
        map.put(10, "Anton");
        map.put(13, "Jenya");
        List<StringBuilder> MapToList= map.entrySet()
                .stream()
                .filter(string -> string.getValue().length() % 2 == 1)
                .filter(integer -> integer.getKey() == 1
                        || integer.getKey() == 2
                        || integer.getKey() == 5
                        || integer.getKey() == 8
                        || integer.getKey() == 9
                        || integer.getKey() == 13)
                .map(string -> new StringBuilder(string.getValue()).reverse())
                .toList();
        System.out.println(MapToList);
    }
}
