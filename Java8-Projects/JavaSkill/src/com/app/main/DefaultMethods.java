package com.app.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface Formula {
    double function1(int a);

    default double function2(int a) {
        return a * a;
    }
}

public class DefaultMethods {
    public static void main(String[] args) {

        //an anonymous object
//        Formula formula = new Formula() {
//            @Override
//            public double function1(int a) {
//                return function2(a);
//            }
//        };
//
//        formula.function1(100); //10000.0

        //Lambda Expression
//        List<String> names = Arrays.asList("A", "B", "C", "D");
//
//        Collections.sort(names, (String a, String b) -> b.compareTo(a));
//
//        names.forEach(a -> System.out.println(a));


        List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        list.stream()
                .filter(s -> s.startsWith("c")) //Intermediate operations
                .sorted() //Intermediate operations
                .map(String::toUpperCase) //Intermediate operations
                .forEach(System.out::println); //Terminal operations


    }
}
