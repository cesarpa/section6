package com.eazybytes.accounts;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        List<List<Integer>> data = List.of(
                List.of(2,5,2,1),
                List.of(3,4)
        );

        Integer[] ac = data.stream()
                .flatMap(list -> list.stream())
                .sorted((a,b)-> a-b>0 ? -1 : 1)
                .distinct()
                .limit(3)
                .toArray(Integer[]::new);

        System.out.println(ac[0]);
    }
}
