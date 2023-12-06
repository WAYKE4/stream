package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(15);
        listInt.add(30);
        listInt.add(48);
        listInt.add(10);
        listInt.add(11);
        listInt.add(12);
        List<Integer> distinctList = listInt.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(distinctList);
        int sum = distinctList.stream().mapToInt(distinct -> distinct).sum();
        System.out.println(sum);
    }
}
