package com.company;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Developer> devList = new ArrayList<>();
        devList.add(new Developer("Petya", 15));
        devList.add(new Developer("Anna", 7));
        devList.add(new Developer("Anytya", 19));
        devList.add(new Developer("Nadya", 1));
        devList.add(new Developer("Anessa", 10));

        devList.stream()
                .filter((line) -> line.name.startsWith("An"))
                .filter((line) -> line.id > 10)
                .forEach(System.out::println);

    }
}
